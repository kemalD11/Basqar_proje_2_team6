package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColumn extends _Parent {


    @Test
    public  void test1() throws SQLException {


//        ResultSet rs= statement.executeQuery("select * from language");
//
//       ResultSetMetaData rsmd=rs.getMetaData();
//       int columnCount=rsmd.getColumnCount();
//
//        System.out.println(columnCount);
//
//        while (rs.next()){
//
//            for (int i = 1; i <= columnCount ; i++) {
//                System.out.print(rs.getString(i)+ " ");
//            }
//            System.out.println();
//        }
        // Task1 : film tablosundaki butun bilgileri listeletiniz
    }
        @Test
        public  void task1() throws SQLException {

            ResultSet rs = statement.executeQuery("select * from film");

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            System.out.println(columnCount);

            while (rs.next()) {

                for (int i = 1; i <= columnCount; i++) {
//                    System.out.print(rs.getString(i) + " ");

                    System.out.printf("%s ", rs.getString(i));
                }
                System.out.println();
            }

        }




        }




