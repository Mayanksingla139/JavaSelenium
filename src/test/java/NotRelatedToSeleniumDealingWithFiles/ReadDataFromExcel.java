package NotRelatedToSeleniumDealingWithFiles;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rows = sheet.getLastRowNum();
        System.out.println("Total Rows in sheet: "+rows);

        int columns = sheet.getRow(0).getLastCellNum();
        System.out.println("Total columns in sheet: "+columns);

        for(int i=0; i<=rows; i++){
            XSSFRow row = sheet.getRow(i);
            for(int j=0; j<columns; j++){
                XSSFCell cell = row.getCell(j);
                System.out.print(cell.toString() + '\t');
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}
