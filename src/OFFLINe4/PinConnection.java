package OFFLINe4;

import sun.rmi.log.LogInputStream;
import sun.security.util.Password;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by vlad on 02.12.2016.
 */
public class PinConnection {
    static {
        try {
            Class.forName("org.postgresl.Driver");
        } catch ( ClassNotFoundException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("URL", "Login","Password");
    }
}
