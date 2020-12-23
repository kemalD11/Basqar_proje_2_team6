package ApachiPOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachiPOIStrart {
    public static void main(String[] args) throws IOException {


        String path="src/main/resources/ApacheExcel1 (1).xlsx";


        // dosya yi yani Exel i okuma ya actim
        FileInputStream dosyaOkumaYolu=new FileInputStream(path);

        //Bunun uzerinden Calisma Kitabini aliyorum

        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaYolu);

        // istedigim isim deki calisma sayfasini aliyorum

        Sheet calismaSayfasi=calismaKitabi.getSheet("sheet1");
//        Sheet calismaSayfasiAyni=calismaKitabi.getSheetAt(0);

        // istenen Satiri aliyorum
         Row satir=calismaSayfasi.getRow(0);

         //istenen satirdaki hucre aliniyor

        Cell hucre=satir.getCell(0);

        System.out.println(hucre);

    }
}
