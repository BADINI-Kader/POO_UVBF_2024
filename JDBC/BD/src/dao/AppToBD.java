package dao;

import classe.User;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class AppToBD {

    private final String url = "jdbc:mysql://localhost:3306/mydb";

    private final String dbUser = "root";

    private final String dbPassword = "secret";

    public AppToBD() { }

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "secret");
            return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public User getUserById(int id) throws SQLException {
        Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE id = ?");
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        User user = new User(rs.getInt("id"), rs.getString("nom"), rs.getString("email"));

        pst.close();
        rs.close();
        con.close();
        return user;
    }

    public Set<User> getAllUsers() throws SQLException {
        Set<User> users = new HashSet<>();
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users");

        while(rs.next()){
            users.add(new User(rs.getInt("id"), rs.getString("nom"), rs.getString("email")));
        }

        rs.close();
        st.close();
        con.close();
        return users;
    }

    public void createUser(User user) throws SQLException {
        Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement("INSERT INTO users (nom, email) VALUES (?, ?)");
        pst.setString(1, user.getNom());
        pst.setString(2, user.getEmail());

        pst.executeUpdate();
        pst.close();
        con.close();
    }

    public void updateUser(User user) throws SQLException {
        Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement("UPDATE users SET nom=?, email=? WHERE id=?");
        pst.setString(1, user.getNom());
        pst.setString(2, user.getEmail());
        pst.setInt(3, user.getId());

        pst.executeUpdate();
        pst.close();
        con.close();
    }

}
