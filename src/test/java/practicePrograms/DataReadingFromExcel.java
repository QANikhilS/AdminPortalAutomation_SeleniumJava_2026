package practicePrograms;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class DataReadingFromExcel {

	
	public FileInputStream fis ; 
	public XSSFWorkbook workbook ; 
	
	
	@Test
	public void printAllSheetData() throws Exception
	{	
		
		String FilePath = System.getProperty("user.dir")+"\\testData\\TestData.xlsx" ; 
		
		fis = new FileInputStream(FilePath);
		
		workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =  workbook.getSheet("Login");
		
		 int firstRowNum = sheet.getFirstRowNum();
		 System.out.println();
		 System.out.println("First Row Number is :- "+firstRowNum);
		 System.out.println("=============================");
	    
		 int lastRowNum = sheet.getLastRowNum();
		 System.out.println("Last Row Number is :- "+lastRowNum);
	     System.out.println("=============================");
	     
	     
	     int lastCellNum = sheet.getRow(0).getLastCellNum();
	     System.out.println("last cellnum " +lastCellNum);
	     System.out.println("=============================");
	     
	     	     
	     for (int r=0 ; r<=lastRowNum ; r++)
		    { 
	    	   XSSFRow row = sheet.getRow(r);
	    	 
		          for (int c=0 ; c<=lastCellNum ; c++)
			         {
			            if (sheet.getRow(r).getCell(c) != null)
               		      {
			            	 XSSFCell cell = row.getCell(c);
	                         switch (cell.getCellType()) 
	                          {
	                          		case STRING:
	                          		System.out.print(cell.getStringCellValue()+"  -  ");
	                          		break;
	                        
	                          		case NUMERIC:
	                          		System.out.print(Integer.valueOf((int)cell.getNumericCellValue())+"  -  ");
	                          		break;
	                        
	                          		case BOOLEAN:
	                          		System.out.print(cell.getBooleanCellValue()+"  -  ");
	                                break;
	                                
	                                case FORMULA:
	                                System.out.print(cell.getCellFormula()+"  -  ");
	                                break;
	                                 
	                                default:
	                                System.out.print("");  // blank or other types
	                    }
			      }
             }
             System.out.println("\t");  // delimiter
         }
         System.out.println();
 
     workbook.close();
     fis.close();
		
	}
	
}	
	

