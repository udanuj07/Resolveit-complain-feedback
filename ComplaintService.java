package project;

import java.sql.*;

public class ComplaintService {

    public static void submitComplaint(int userId, String category, String desc) {
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO complaints(user_id,category,description,status) VALUES (?,?,?, 'Pending')"
            );
            ps.setInt(1, userId);
            ps.setString(2, category);
            ps.setString(3, desc);
            ps.executeUpdate();
            System.out.println("Complaint submitted!");
        } catch(Exception e) { e.printStackTrace(); }
    }

    public static void viewAll() {
        try {
            Connection con = DB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM complaints");

            while(rs.next()) {
                System.out.println("\nComplaint ID: " + rs.getInt("complaint_id"));
                System.out.println("User ID: " + rs.getInt("user_id"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Status: " + rs.getString("status"));
            }

        } catch(Exception e) { e.printStackTrace(); }
    }

    public static void updateStatus(int complaintId, String status) {
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE complaints SET status=? WHERE complaint_id=?"
            );
            ps.setString(1, status);
            ps.setInt(2, complaintId);
            ps.executeUpdate();
            System.out.println("Status updated!");
        } catch(Exception e) { e.printStackTrace(); }
    }
}

