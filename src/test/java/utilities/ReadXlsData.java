package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadXlsData {

	
		@DataProvider(name="loginData")
		public String[] [] getData() throws Exception
		{
			
			File excelfile = new File(System.getProperty("user.dir")+"\\testdata.xlsx");
			FileInputStream fis = new FileInputStream(excelfile);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("login");
			int rowCount = sheet.getLastRowNum();
			int columnCount= sheet.getRow(0).getLastCellNum();
			Object [] [] data = new Object[rowCount][columnCount];
			for(int r=0; r<rowCount;r++)
			{
				XSSFRow row = sheet.getRow(0+1);
				for(int c=0;c<columnCount;c++)
				{
					XSSFCell cell = row.getCell(c);
					CellType celltype = cell.getCellType();
					
					switch(celltype)
					{
					
					case STRING:
						data [r][c] =cell.getStringCellValue();
						break;
						
					case NUMERIC:
						 Integer.toString((int)cell.getNumericCellValue());
						 break;
					case BOOLEAN:
						data [r][c] = cell.getBooleanCellValue();
						break;
					
					
					}
					
					
				}
				
			}
			 
			return getData();
					
		}
	}


