package JDBC.Gun01;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsuluteRelative extends _Parent {

    @Test
     public  void  test1() throws SQLException {



        statement.executeQuery("select * from film");
        ResultSet rs= statement.executeQuery("select * from film");

        rs.absolute(10);  // 10. satira git
         String title= rs.getString("title");
        System.out.println(title);

        rs.absolute(15);  // absolute verilen satira gider.
        title= rs.getString("title");
        System.out.println(title);


        rs.relative(5);  // relative verilen satirdan 5 ileri  gider. yani 20. satira gider
        title= rs.getString("title");
        System.out.println(title);


    }

}
