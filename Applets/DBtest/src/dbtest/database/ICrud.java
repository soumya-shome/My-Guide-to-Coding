package dbtest.database;
import dbtest.model.User;

public interface ICrud {
    boolean insert(User user);
    User getUser(String userName, String password); 
}
