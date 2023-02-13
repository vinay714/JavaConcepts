package ThirdChaptor;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// step 1 convert physical file into java readable formate
		FileInputStream fil = new FileInputStream("./TestResources/testdata.xlsx");

		// step 2 open workbook
		// work, WorkFactory, sheet, row cell should imported from
		// apache.poi.ss.usermodel
		// EncryptedDocumentException and IOException it throws

		Workbook wb = WorkbookFactory.create(fil);

		// step 3 get control over particular sheet

		// Sheet sh = wb.getSheet("sheet1");

		// step 4 get control over perticular row

		// Row r = sh.getRow(1);

		// step 5 get control over perticular cell

		// Cell c = r.getCell(1);

		// step 6 read data from the cell

		// System.out.println(c.getStringCellValue());

		System.out.println(wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue());

		// step 7 close workbook
		// IOException
		wb.close();

	}

}
