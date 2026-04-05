package NotRelatedToSeleniumDealingWithFiles;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIntoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int columns = sc.nextInt();

        for(int i=0; i<rows; i++){
            XSSFRow row = sheet.createRow(i);
            for(int j=0; j<columns; j++){
                XSSFCell cell = row.createCell(j);
                System.out.print("Enter Value you want to insert: ");
                cell.setCellValue(sc.next());
            }
        }
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.print("File is created Successfully");
    }
}
