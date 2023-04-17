package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelRead 
{
	public void excelWriteData() throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../XlsFileAssignments/Practice2.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Fadi1", 0);
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Label L=new Label(j,i,"f");
				ws.addCell(L);
				
			}
		}
		wk.write();
		wk.close();
		
		
	}
	
	
	
	
	public void excelReadData() throws BiffException, IOException
	{
		File f=new File("../XlsFileAssignments/Practice1.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int row=ws.getRows();
		int colomn=ws.getColumns();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colomn;j++)
			{
				Cell c1=ws.getCell(j, i);
				System.out.println(c1.getContents());
			}
		}
		
		
	}
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		ExcelRead ex=new ExcelRead();
		ex.excelWriteData();
		
	}
	

}
