import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ColorCatchGame extends Application {

    // Constants
    private static final int WIDTH = 600;
    private static final int HEIGHT = 800;
    private static final int PLAYER_WIDTH = 100;
    private static final int PLAYER_HEIGHT = 20;

    // Player state
    private double playerX = WIDTH / 2 - PLAYER_WIDTH / 2;
    private Color playerColor = Color.RED;

    // Game state
    private boolean gameOver = false;
    private int score = 0;
    private final ArrayList<Block> blocks = new ArrayList<>();
    private final Random random = new Random();
    private long lastBlockTime = 0;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Group root = new Group(canvas);
        Scene scene = new Scene(root);

        // Handle input
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.LEFT) {
                playerX -= 30;
                if (playerX < 0) playerX = 0;
            }
            if (e.getCode() == KeyCode.RIGHT) {
                playerX += 30;
                if (playerX + PLAYER_WIDTH > WIDTH) playerX = WIDTH - PLAYER_WIDTH;
            }
            if (e.getCode() == KeyCode.SPACE) {
                toggleColor();
            }
            if (e.getCode() == KeyCode.ENTER && gameOver) {
                resetGame();
            }
        });

        stage.setTitle("Color Catch Game");
        stage.setScene(scene);
        stage.show();

        // Main game loop
        new AnimationTimer() {
            public void handle(long now) {
                if (!gameOver) {
                    updateBlocks(now);
                    checkCollisions();
                }
                drawGame(gc);
            }
        }.start();
    }

    // Add new blocks periodically
    private void updateBlocks(long now) {
        if (now - lastBlockTime > 1_000_000_000) {
            blocks.add(new Block(random.nextInt(WIDTH - 30), 0, getRandomColor()));
            lastBlockTime = now;
        }

        for (Block block : blocks) {
            block.y += 5;
        }

        // Check if a block reached the ground
        for (Block block : blocks) {
            if (block.y > HEIGHT) {
                gameOver = true;
            }
        }
    }

    // Draw game components
    private void drawGame(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        // Player bar
        gc.setFill(playerColor);
        gc.fillRect(playerX, HEIGHT - 50, PLAYER_WIDTH, PLAYER_HEIGHT);

        // Falling blocks
        for (Block block : blocks) {
            gc.setFill(block.color);
            gc.fillRect(block.x, block.y, 30, 30);
        }

        // Score
        gc.setFill(Color.WHITE);
        gc.fillText("Score: " + score, 10, 20);

        // Game over text
        if (gameOver) {
            gc.setFill(Color.RED);
            gc.fillText("Game Over! Press ENTER to Restart", WIDTH / 2 - 100, HEIGHT / 2);
        }
    }

    // Check for catching blocks
    private void checkCollisions() {
        Iterator<Block> iterator = blocks.iterator();
        while (iterator.hasNext()) {
            Block block = iterator.next();
            boolean hitPlayer = block.y + 30 >= HEIGHT - 50 && block.y <= HEIGHT &&
                    block.x + 30 > playerX && block.x < playerX + PLAYER_WIDTH;

            if (hitPlayer) {
                if (block.color.equals(playerColor)) {
                    score++;
                    iterator.remove();
                } else {
                    gameOver = true;
                }
            }
        }
    }

    // Switch player color
    private void toggleColor() {
        playerColor = playerColor.equals(Color.RED) ? Color.BLUE : Color.RED;
    }

    // Random red or blue
    private Color getRandomColor() {
        return random.nextBoolean() ? Color.RED : Color.BLUE;
    }

    // Restart the game
    private void resetGame() {
        score = 0;
        playerX = WIDTH / 2 - PLAYER_WIDTH / 2;
        playerColor = Color.RED;
        gameOver = false;
        blocks.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Block class
    static class Block {
        double x, y;
        Color color;

        Block(double x, double y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }
}
