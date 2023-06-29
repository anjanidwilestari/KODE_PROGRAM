package backend;

import java.util.ArrayList;
import java.sql.*;

public class login {
    private String username;
    private String password;
    
    public login(){
        
    }
    
    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void prosesLogin(String username, String password){
        ArrayList<user> listUser = new ArrayList();
        
        String query = "SELECT * FROM user"
                    + " WHERE usernama = '" + username + "'"
                    + " AND password = '" + password + "'";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        boolean cek = true;
    }
}
