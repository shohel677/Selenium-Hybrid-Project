package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GoDataProvider {

	public ArrayList<String> getData(String testcaseName) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		// Get excel location and make object
		FileInputStream fis = new FileInputStream("resources/testdata.xlsx");
		try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
			int sheets = workbook.getNumberOfSheets();
			for (int i = 0; i < sheets; i++) {
				if (workbook.getSheetName(i).equalsIgnoreCase("campiagn")) {
					XSSFSheet sheet = workbook.getSheetAt(i);
					Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
					Row firstrow = rows.next();
					Iterator<Cell> ce = firstrow.cellIterator();// row is collection of cells
					int k = 0;
					int coloumn = 0;
					while (ce.hasNext()) {
						Cell value = ce.next();
						if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
							coloumn = k;
						}
						k++;
					}
					while (rows.hasNext()) {

						Row r = rows.next();
						if (r.getCell(coloumn) != null
								&& r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {
							Iterator<Cell> cv = r.cellIterator();
							while (cv.hasNext()) {

								Cell c = cv.next();
								if (c.getCellType() == CellType.STRING) {

									a.add(c.getStringCellValue());
								} else {

									a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

								}
							}
						}
					}

					// cell identified for input cell

				}

			}
		}
		return a;

	}

	public static void main(String[] args) throws IOException {

	}
}