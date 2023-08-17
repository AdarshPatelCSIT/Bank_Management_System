package bank.management.system;

import java.sql.*;

public class Conn {
    Statement s;

    public Conn() {
        Connection c;

        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "826590");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
