import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sudokuSolver extends JFrame {
    private JTextField[][] grid = new JTextField[9][9];
    private JComboBox<String> levelSelector;
    private JButton solveButton, newPuzzleButton;

    public sudokuSolver() {
        setTitle("Sudoku Solver");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create Sudoku grid
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(9, 9));
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                grid[row][col] = new JTextField();
                grid[row][col].setHorizontalAlignment(JTextField.CENTER);
                grid[row][col].setFont(new Font("SansSerif", Font.BOLD, 20));
                grid[row][col].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                gridPanel.add(grid[row][col]);
            }
        }

        // Control panel
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // Level selector
        String[] levels = {"Easy", "Medium", "Hard"};
        levelSelector = new JComboBox<>(levels);
        controlPanel.add(levelSelector);

        // Buttons
        solveButton = new JButton("Solve");
        newPuzzleButton = new JButton("New Puzzle");
        controlPanel.add(solveButton);
        controlPanel.add(newPuzzleButton);

        // Add listeners
        solveButton.addActionListener(new SolveListener());
        newPuzzleButton.addActionListener(new NewPuzzleListener());

        // Add panels to frame
        add(gridPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    // Listener for solving Sudoku
    private class SolveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int[][] board = new int[9][9];
            try {
                for (int row = 0; row < 9; row++) {
                    for (int col = 0; col < 9; col++) {
                        String text = grid[row][col].getText().trim();
                        board[row][col] = text.isEmpty() ? 0 : Integer.parseInt(text);
                    }
                }
                if (solveSudoku(board)) {
                    updateGrid(board);
                } else {
                    JOptionPane.showMessageDialog(null, "No solution exists!");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input! Enter numbers between 1 and 9.");
            }
        }
    }

    // Listener for generating a new puzzle
    private class NewPuzzleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String level = (String) levelSelector.getSelectedItem();
            int[][] newPuzzle = generatePuzzle(level);
            updateGrid(newPuzzle);
        }
    }

    // Update grid with solved or new puzzle
    private void updateGrid(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                grid[row][col].setText(board[row][col] == 0 ? "" : String.valueOf(board[row][col]));
            }
        }
    }

    // Backtracking algorithm for solving Sudoku
    private boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValidMove(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board)) {
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidMove(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num || board[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    // Generate new puzzles based on level
    private int[][] generatePuzzle(String level) {
        // Example: Predefined puzzles for simplicity
        if (level.equals("Easy")) {
            return new int[][]{
                    {5, 3, 0, 0, 7, 0, 0, 0, 0},
                    {6, 0, 0, 1, 9, 5, 0, 0, 0},
                    {0, 9, 8, 0, 0, 0, 0, 6, 0},
                    {8, 0, 0, 0, 6, 0, 0, 0, 3},
                    {4, 0, 0, 8, 0, 3, 0, 0, 1},
                    {7, 0, 0, 0, 2, 0, 0, 0, 6},
                    {0, 6, 0, 0, 0, 0, 2, 8, 0},
                    {0, 0, 0, 4, 1, 9, 0, 0, 5},
                    {0, 0, 0, 0, 8, 0, 0, 7, 9},
            };
        } else if (level.equals("Medium")) {
            // Add a medium puzzle
        } else if (level.equals("Hard")) {
            // Add a hard puzzle
        }
        return new int[9][9]; // Return an empty grid for other cases
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            sudokuSolver solver = new sudokuSolver();
            solver.setVisible(true);
        });
    }
}
