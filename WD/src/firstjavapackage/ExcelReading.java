package firstjavapackage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	
	public static void main(String[] args) throws Exception{
		
		XSSFWorkbook wb=new XSSFWorkbook("TestData.xlsx");
		
		XSSFSheet sh=wb.getSheet("Data");
		
		int rowCount=sh.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++)
		{
			int colCount=sh.getRow(i).getPhysicalNumberOfCells();
			  for(int j=0;j<colCount;j++)
			  {
		String str=sh.getRow(i).getCell(j).getStringCellValue();
				  System.out.println(str);
			  }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
