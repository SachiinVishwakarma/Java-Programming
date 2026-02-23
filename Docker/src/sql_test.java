import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class sql_test {

    static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Backend;encrypt=false;trustServerCertificate=true";
    static final String USER = "CodewithSachin";
    static final String PASSWORD = "CodewithSachin";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("✅ Connected to MSSQL successfully!");

            createNamesTable(conn);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n1. Add a name");
                System.out.println("2. Show all names");
                System.out.println("3. Quit");
                System.out.println("4. Delete a name");
                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter a name: ");
                        String name = scanner.nextLine();
                        insertName(conn, name);
                        break;
                    case "2":
                        fetchAllNames(conn);
                        break;
                    case "3":
                        System.out.println("👋 Goodbye!");
                        return;
                    case "4":
                        System.out.print("Enter name to delete: ");
                        String nameToDelete = scanner.nextLine();
                        deleteName(conn, nameToDelete);
                        break;
                    default:
                        System.out.println("⚠️ Invalid choice. Try again.");
                }
            }

        } catch (SQLException e) {
            System.out.println("❌ Database connection error: " + e.getMessage());
        }
    }

    public static void createNamesTable(Connection conn) throws SQLException {
        String query = "IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='names' AND xtype='U') " +
                "CREATE TABLE names (NAME VARCHAR(255) NOT NULL)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(query);
            System.out.println("✅ 'names' table is ready.");
        }
    }

    public static void insertName(Connection conn, String name) throws SQLException {
        String query = "INSERT INTO names (NAME) VALUES (?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            appendToFile("servers.txt", name);
            System.out.println("✅ Name '" + name + "' added to the 'names' table.");
        }
    }

    public static void fetchAllNames(Connection conn) throws SQLException {
        String query = "SELECT NAME FROM names";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("\n🧾 Names in the 'names' table:");
            boolean hasResults = false;
            while (rs.next()) {
                System.out.println("- " + rs.getString("NAME"));
                hasResults = true;
            }
            if (!hasResults) {
                System.out.println("No records found.");
            }
        }
    }

    public static void deleteName(Connection conn, String name) throws SQLException {
        String query = "DELETE FROM names WHERE NAME = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("🗑️ Name '" + name + "' deleted from the 'names' table.");
                removeFromFile("servers.txt", name);
            } else {
                System.out.println("⚠️ Name '" + name + "' not found.");
            }
        }
    }

    public static void appendToFile(String filename, String name) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(name);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    public static void removeFromFile(String filename, String name) {
        try {
            File file = new File(filename);
            if (!file.exists()) return;

            File tempFile = new File("temp.txt");
            try (BufferedReader reader = new BufferedReader(new FileReader(file));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().equals(name)) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }

            if (file.delete()) {
                tempFile.renameTo(file);
            }
        } catch (IOException e) {
            System.err.println("❌ Error modifying file: " + e.getMessage());
        }
    }
}
