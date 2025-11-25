package project;

import java.sql.*;

public class UserService {

    public static int register(String username, String password) {
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO users(username,password,role) VALUES (?, ?, 'user')"
            );
            ps.setString(1, username);
            ps.setString(2, password);
            return ps.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static User login(String username, String password) {
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM users WHERE username=? AND password=?"
            );
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                User u = new User();
                u.userId = rs.getInt("user_id");
                u.username = rs.getString("username");
                u.role = rs.getString("role");
                return u;
            }
        } catch(Exception e) { e.printStackTrace(); }
        return null;
    }
}

