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
            Class.forName("org.postgresql.Driver");
        } catch ( ClassNotFoundException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(System.getProperty("User")+" "+System.getProperty("Password"));
        String URL="jdbc:postgresql://localhost:5432/goitbase";
        String Login ="postgres";
        String Password="19071993";
        Connection connection = DriverManager.getConnection(URL, System.getProperty("User"), System.getProperty("Password"));
        connection.close();

    }
}
