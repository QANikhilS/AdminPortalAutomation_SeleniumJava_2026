package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
    
    public static void ExcelUtilies() throws IOException 
    {
        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\testData\\TestData.xlsx")) 
        {
            workbook = new XSSFWorkbook(fis);
        }
    }
    
    
    public static int getRowCount(String sheetName) 
    {
    	try {  ExcelUtilies();  } catch (IOException e) { e.printStackTrace(); 	}
    	sheet = workbook.getSheet(sheetName);
    	int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        return rowCount ;
    }
    
    public static int getColCount(String sheetName) 
    {
    	try {  ExcelUtilies();  } catch (IOException e) { e.printStackTrace(); 	}
    	sheet = workbook.getSheet(sheetName);
    	int cellCount = sheet.getRow(1).getLastCellNum();
        return cellCount;
    }
    
    
    
    public static String getCellData(String sheetName, int row, int col) 
    {
    	try {  ExcelUtilies();  } catch (IOException e) { e.printStackTrace(); 	}
    	sheet = workbook.getSheet(sheetName);
    	String mentionedCellValue = sheet.getRow(row).getCell(col).getStringCellValue(); 
        return mentionedCellValue;
    }
    
    public void close() throws IOException {
        workbook.close();
    }

		
}
