package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class rough {

	public static void main(String[] args) throws IOException {

		ExcelReader();
	}

	
	
	@DataProvider(name = "testdata")
	public static Object[][] ExcelReader() throws IOException {

		File fs = new File("C:\\Users\\manasa\\Desktop\\TestData.xlsx");

		FileInputStream fils = new FileInputStream(fs);

		XSSFWorkbook workbook = new XSSFWorkbook(fils);

		Sheet st = workbook.getSheet("sheet1");

		int TotalROws = st.getPhysicalNumberOfRows();
		int TotaoColumn = st.getRow(0).getLastCellNum();

		System.out.println(TotalROws);
		System.out.println(TotaoColumn);

		Object[][] data = new Object[TotalROws - 1][TotaoColumn];

		for (int i = 0; i < TotalROws - 1; i++) {

			for (int j = 0; j < TotaoColumn; j++) {

				DataFormatter dt = new DataFormatter();
				data[i][j] = dt.formatCellValue(st.getRow(i + 1).getCell(j));

			}

		}
		return data;

	}
}
