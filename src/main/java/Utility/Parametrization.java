package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String test(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\Book2.xlsx");
		String value=WorkbookFactory.create(file).getSheet("login").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
