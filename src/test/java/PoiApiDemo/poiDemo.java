package PoiApiDemo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiDemo {
	public static Object[][] getData() {
		

	String filepath = "./src/test/java/PoiApiDemo/poidemo.xlsx";
	XSSFWorkbook wb = null;
	try {
		wb = new XSSFWorkbook(filepath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	XSSFSheet sheet = wb.getSheet("Sheet1");
	
	int rowcount = sheet.getPhysicalNumberOfRows();
	int colcount = sheet.getRow(0).getLastCellNum();
	
	System.out.println("Row count =" +rowcount);
	System.out.println("Coloum count =" +colcount);
	
	Object[][] data = new Object[rowcount][colcount];
	
	for(int row=0; row < rowcount;row++ ) {
		for(int col=0; col < colcount ; col++) {
			data[row][col]= sheet.getRow(row).getCell(col).getStringCellValue();
		}
	}
	return data;

}
}