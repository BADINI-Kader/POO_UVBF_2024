import classe.User;
import dao.AppToBD;

import java.sql.*;
import java.util.Set;

public class BD {

    public static void main (String[] args){

        /**try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "secret");

            System.out.println("Connexion reussit");

            //Insertion classique
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO users (nom, email) VALUES ('John', 'johndoe@email.com')");

            //Lecture classique
            //Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users");

            while(rs.next()){
                System.out.println(rs.getString("email"));
            }

            rs.close();
            con.close();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } */


        //User user = new User(1, "Adama", "Traore");
        AppToBD dao = new AppToBD();

        try {
            //dao.createUser(user);
            dao.updateUser(new User(1, "John Doe", "johndoe@gmail.com"));

            Set<User> users = dao.getAllUsers();
            for(User element : users){
                element.afficher();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
