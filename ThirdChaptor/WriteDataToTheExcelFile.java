package ThirdChaptor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToTheExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fil = new FileInputStream("./TestResources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fil);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.createRow(4);
		Cell c = r.createCell(0);
		
		c.setCellValue("Teat");
		
		FileOutputStream fos = new FileOutputStream("./TestResources/testdata.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
