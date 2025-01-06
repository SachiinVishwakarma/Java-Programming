import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
    private JFrame frame;
    private JButton[][] buttons;
    private char currentPlayer;
    private JLabel statusLabel;

    public TicTacToe() {
        currentPlayer = 'X';
        initializeUI();
    }

    // Initialize the UI
    private void initializeUI() {
        frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);

        // Main panel
        JPanel panel = new JPanel(new GridLayout(3, 3));
        buttons = new JButton[3][3];

        // Create buttons for the grid
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].setFont(new Font("Arial", Font.BOLD, 40));
                buttons[row][col].setFocusPainted(false);
                buttons[row][col].addActionListener(new ButtonClickListener(row, col));
                panel.add(buttons[row][col]);
            }
        }

        // Status panel
        JPanel statusPanel = new JPanel(new BorderLayout());
        statusLabel = new JLabel("Player X's Turn", JLabel.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20));
        statusPanel.add(statusLabel, BorderLayout.CENTER);

        // Reset button
        JButton resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 18));
        resetButton.addActionListener(e -> resetGame());
        statusPanel.add(resetButton, BorderLayout.EAST);

        // Add panels to frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(statusPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    // Handle button clicks
    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (buttons[row][col].getText().equals("") && !isGameOver()) {
                buttons[row][col].setText(String.valueOf(currentPlayer));
                if (checkWinner(currentPlayer)) {
                    statusLabel.setText("Player " + currentPlayer + " wins!");
                } else if (isBoardFull()) {
                    statusLabel.setText("It's a draw!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    statusLabel.setText("Player " + currentPlayer + "'s Turn");
                }
            }
        }
    }

    // Check if the board is full
    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if the current player has won
    private boolean checkWinner(char player) {
        String symbol = String.valueOf(player);

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(symbol) && buttons[i][1].getText().equals(symbol) && buttons[i][2].getText().equals(symbol)) {
                return true;
            }
            if (buttons[0][i].getText().equals(symbol) && buttons[1][i].getText().equals(symbol) && buttons[2][i].getText().equals(symbol)) {
                return true;
            }
        }

        // Check diagonals
        if (buttons[0][0].getText().equals(symbol) && buttons[1][1].getText().equals(symbol) && buttons[2][2].getText().equals(symbol)) {
            return true;
        }
        if (buttons[0][2].getText().equals(symbol) && buttons[1][1].getText().equals(symbol) && buttons[2][0].getText().equals(symbol)) {
            return true;
        }

        return false;
    }

    // Check if the game is over
    private boolean isGameOver() {
        return !statusLabel.getText().contains("Turn");
    }

    // Reset the game
    private void resetGame() {
        currentPlayer = 'X';
        statusLabel.setText("Player X's Turn");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setText("");
            }
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TicTacToe::new);
    }
}
