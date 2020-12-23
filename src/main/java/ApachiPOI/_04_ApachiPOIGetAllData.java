package ApachiPOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.IOException;



public class _04_ApachiPOIGetAllData {
    public static void main(String[] args) throws IOException {


        String path="src/main/resources/ApacheExcel1 (1).xlsx";
        FileInputStream InputStream=new FileInputStream(path);
        Workbook Workbook= WorkbookFactory.create(InputStream);
        Sheet sheet=Workbook.getSheet("sheet1");


        ///calisma sayfasindaki toplam satir sayisini veriyor

        int rowCount=sheet.getPhysicalNumberOfRows();
        System.out.println("Satir Sayisi : "+rowCount);

        for (int i = 0; i <rowCount ; i++) {

         //   int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();

            Row row=sheet.getRow(i);  // i. Satir alindi
            int cellCount=row.getPhysicalNumberOfCells();   // bu satirdaki toplam hucre sayisi alindi.

            for (int j = 0; j < cellCount ; j++)    // i. satirdaki hucre sayisi kadar donecek
            {

                Cell cell= row.getCell(j);         // bu satirdaki ,siradaki hucreyi aldim.
//                System.out.print(cell+ " ");

                System.out.printf ("%-20s", cell);

            }
            System.out.println();

        }


    }
}
