package example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OperationClass {
    Scanner sc = new Scanner(System.in);
    Connection con = null;
    ConnectionClass conObject = new ConnectionClass();
    int count = 0;

    public void insert_record() throws ClassNotFoundException, SQLException {
        System.out.println("Enter student ID:");
        int studentID = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.println("Enter student Name:");
        String studentName = sc.nextLine();
        System.out.println("Enter student Course:");
        String studentCourse = sc.nextLine();
        System.out.println("Enter student Batch:");
        String studentBatch = sc.nextLine();
        
        try {
            con = conObject.getConnection();
            String insertQuery = "INSERT INTO student (studentID, studentNAME, studentCOURSE, studentBATCH) VALUES (?, ?, ?, ?)";
            PreparedStatement psmt = con.prepareStatement(insertQuery);
            psmt.setInt(1, studentID);
            psmt.setString(2, studentName);
            psmt.setString(3, studentCourse);
            psmt.setString(4, studentBatch);
            int rowsAffected = psmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Record not inserted");
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    // Implement other methods (update, delete, display_one, display_All)
}
