package JDBC.Gun01;


import org.testng.annotations.Test;

import java.sql.*;

public class _01_Giris {

    @Test
    public  void test1() throws SQLException {


        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";


        Connection connection= DriverManager.getConnection(url,username,password); //baglanti saglandi.
        Statement statement=connection.createStatement();  // sorgularimi calistirabilmek icin bir yol olustur.

      ResultSet rs=  statement.executeQuery("select * from actor"); //calistirildi sonuclar rs degiskenine set edildi.
        // fakat performans icin butun sonuclar bir anda rs ye aktarilmiyor.Biz komut verdikce satir satir gelecek.

        // 1. satir
        rs.next(); // gostergeyi sonraki adima getir, satir varsa butun satiri rs ye at.

        String firstName=rs.getString("first_name");
        String lastName= rs.getString("last_name");

        System.out.println(firstName+ " " + lastName);


        // 2. satir
        rs.next(); // gostergeyi sonraki adima getir, satir varsa butun satiri rs ye at.

        String firstName1=rs.getString("first_name");
        String lastName1= rs.getString("last_name");

        System.out.println(firstName1+ " " + lastName1);

        connection.close();

    }
}
