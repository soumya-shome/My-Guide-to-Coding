package dbtest.helper;

import dbtest.database.ICrudImpl;
import dbtest.model.User;

public class Controller {
    
    private static Controller controller;
    private final ICrudImpl iCrudImpl;
    
    private Controller(){
        this.iCrudImpl =new ICrudImpl();
        this.iCrudImpl.openConnection();
    }
    
    public static Controller getController(){
        if (controller==null){
            controller=new Controller();
        }
        return controller;
    }

    public boolean signup(User user) {
        return this.iCrudImpl.insert(user);
    }
    
    public User login(String username, String password) {
        return this.iCrudImpl.getUser(username, password);
    }
}
