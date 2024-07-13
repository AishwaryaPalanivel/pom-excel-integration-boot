package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class ReadData {
public static String[][] readData(String excelFileName) throws IOException {
//open the workboo
	XSSFWorkbook workbook=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
	//Enter into specific worksheet either by using sheet index/sheet name
	XSSFSheet worksheet= workbook.getSheetAt(0);
	
//	//Enter into specific row
//	XSSFRow row = worksheet.getRow(0);
//	//Enter into specific column/cell
//	XSSFCell cell = row.getCell(0);
//	//Read the data from each cell
//	String data = cell.getStringCellValue();
//	System.out.println(data);
//get the rowcount
	int rowCount= worksheet.getLastRowNum();
	System.out.println("Total no of rows :"+rowCount);
	//get the columncount
	int columncount = worksheet.getRow(0).getLastCellNum();
	System.out.println("Total no of rows :"+columncount);
	String[][] data= new String[rowCount][columncount];
	for(int i=1;i<=rowCount;i++) {
	XSSFRow row = worksheet.getRow(i);
	for(int j=0;j<columncount;j++) {
String stringCellData = row.getCell(j).getStringCellValue();
System.out.println(stringCellData);
data[i-1][j]=stringCellData;
	}
	}
workbook.close();
return data;
}
}