package datafilesPackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Utili {
	
static String Userdirectory= null;
	public static String getExceldata(String sheetname, int row, int col) throws Exception

	{
		String celldata = null;
		try {
			Userdirectory = System.getProperty("user.dir");
		
			FileInputStream fis = new FileInputStream(Userdirectory + "//TestData2.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			DataFormatter formatter = new DataFormatter();
			Cell cellformat = sh.getRow(row).getCell(col);
			celldata = formatter.formatCellValue(cellformat);
			System.out.println(celldata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return celldata;
}
	public static String getpropvalue(String key) {
		String value = null;
		try {
			Userdirectory = System.getProperty("user.dir");
			Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(Userdirectory + "//datavalue.properties");
			
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static void dropDown(WebElement day, String value) {
		// TODO Auto-generated method stub
		try{
			Select s = new Select(day);
	        s.selectByVisibleText(value);
		}
		catch(Exception e) {
			System.out.println(e + " in dropdown method");
		}}}