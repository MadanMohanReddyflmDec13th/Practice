package mar19th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Madan Java\\ExcelPractice.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");

		// System.out.println("getLastRowNum "+ws.getLastRowNum());
		// System.out.println("getPhysicalNumberOfRows "+ws.getPhysicalNumberOfRows());

		// System.out.println(ws.getRow(1).getLastCellNum());
		// System.out.println(ws.getRow(1).getPhysicalNumberOfCells());

		Iterator<Row> rowItr =ws.rowIterator();
		
		Row row= null;
		Cell cell=null;
		
		while(rowItr.hasNext())
		{
			row= rowItr.next();
			
			Iterator<Cell> cellItr=row.cellIterator();
			
			while(cellItr.hasNext())
			{
				cell=cellItr.next();
			

			// Retrieving cell values along with its type
			if (cell.getCellType() == CellType.NUMERIC) 
			{
				System.out.println(cell.getNumericCellValue() + " is a Number");
			}
			else if (cell.getCellType() == CellType.STRING) 
			{
				System.out.println(cell.getStringCellValue() + " is a String");
			} 
			else if (cell.getCellType() == CellType.BOOLEAN) 
			{
				System.out.println(cell.getBooleanCellValue() + " is a Boolean");
			}
			
			}
			
		}
		
	}

}


