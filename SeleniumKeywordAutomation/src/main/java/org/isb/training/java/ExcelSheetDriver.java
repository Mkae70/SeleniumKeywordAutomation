package org.isb.training.java;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.log4j.Logger;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelSheetDriver {
	Sheet worksheet;
	Workbook workbook =null;
	Hashtable<Object,Object> dict= new Hashtable<Object,Object>();
	
	Logger logger = Logger.getLogger("ExcelSheetDriver");
	
	public Sheet getWorksheet(String WorkbookPath,String sheetname) throws BiffException, IOException
	{
		//Initialize
		
		workbook = Workbook.getWorkbook(new File(WorkbookPath));
		worksheet = workbook.getSheet(sheetname);
		return worksheet;
		
	}
	
	//Returns the Number of Rows
		public int rowCount()
		{
			return worksheet.getRows();	
		}

		//Returns the Number of Columns
		public int columnCount()
		{
			return worksheet.getColumns();
		}
		
		//Returns the Cell value by taking row and Column values as argument
		public String readCell(Sheet sheet,int column,int row)
		{
			return sheet.getCell(column,row).getContents();
		}
		

}
