package excelreadandwriteDone;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    //Done
    public static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/WriteTestExcelFile.xlsx";
    public static void main(String[] args) {
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"},
                {"Zea", "Is Good", "Student"}
        };
        writeExcel(FILE_NAME, "miru", datatypes);
    }
    public static void writeExcel(String filePath, String sheetName, Object[][] data) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        int rowNum = 0;
        System.out.println("Excel File Created");
        for (Object[] dt : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : dt) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream out = new FileOutputStream(filePath);
            workbook.write(out);
            workbook.close();
        } catch (FileNotFoundException fn) {
            System.out.println("File not Found Exception");
        } catch (IOException io) {
            System.out.println("Done");
        }
    }
}
