package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_sqlExemple extends _Parent {

    @Test
     public  void  relativeExample () throws SQLException {

        ResultSet rs=statement.executeQuery("select * from city");

        rs.relative(5);  // en son bulunan yerden 5 adim ilerideki satirin bilgisini aldik
        String cityName=rs.getString(2);
        System.out.println(cityName);

        rs.relative(6);  // en son bulunan yerden 6 adim ilerideki satirin bilgisini aldik
        cityName=rs.getString(2);
        System.out.println(cityName);

    }
    @Test
    public  void  lastFirstKeyword() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from city");


        rs.last(); // en son row a gidiyor.
        String cityName=rs.getString("city");
        Integer countryId = rs.getInt("country_id");

        System.out.println(cityName+" -- "+ countryId);

        rs.first();
        cityName=rs.getString("city");
        countryId = rs.getInt("country_id");

        System.out.println(cityName+" -- "+ countryId);


    }
    // todo SORU 1:
    // Adress tablosundaki disrict alanini once 10. satirindakini sonra,
    // 22. satirdaki,sonra en son satirdaki bilgisini yazdiriniz.

    @Test
    public  void task1() throws SQLException {

        // 1.yontem

//        ResultSet rs=statement.executeQuery("select * from address");
//        rs.relative(10);
//        String  disrict=rs.getString(4);
//        rs.relative(12);
//        System.out.println(disrict);
//        disrict=rs.getString(4);
//        rs.last();
//        System.out.println(disrict);
//        disrict=rs.getString(4);
//        System.out.println(disrict);

        // 2.yontem

        ResultSet rs=statement.executeQuery("select district from address");

        rs.absolute(12);
        String district=rs.getString(1);
        System.out.println(district);


        rs.relative(12);
        district=rs.getString(1);
        System.out.println(district);

        rs.last();
        district=rs.getString(1);
        System.out.println(district);
    }


}
