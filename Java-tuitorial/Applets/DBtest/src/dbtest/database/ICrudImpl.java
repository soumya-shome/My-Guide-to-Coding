package dbtest.database;
import com.mysql.jdbc.Connection;
import java.sql.*;
import dbtest.model.User;

public class ICrudImpl implements ICrud {
    private Connection connection;

    public void openConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test_db?useSSL=false","root","");
            System.out.println("Connection Established");
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("Error"+e.getMessage());
        }
    }

    @Override
    public boolean insert(User user) {
        try {
            String query = "INSERT INTO users values ('" + user.getUserName() + "','" + user.getName() + "','" + user.getLastName() + "','" + user.getPassword() + "')";
            Statement statement = this.connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public User getUser(String userName, String password) {
        try {
            String query = "SELECT * FROM users where username = '" + userName + "' and password = '" + password + "'";

            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            User user = null;

            if (resultSet.next()) {
                user = new User();
                user.setUserName(resultSet.getString("username"));
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastname"));
                user.setPassword(resultSet.getString("password"));
            }
            preparedStatement.close();
            resultSet.close();
            return user;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
