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

public class Readf1AndWritef2 
{
	public void Readf1() throws BiffException, IOException
	{
		File f=new File("../XlsFileAssignments/Practice3.xls");
	
		Workbook wk=Workbook.getWorkbook(f);
		
		Sheet ws=wk.getSheet(0);
		int row=ws.getRows();
		int col=ws.getColumns();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());
				
			}
		}
		
		File f1=new File("../XlsFileAssignments/Practice1.xls");
		WritableWorkbook wk1=Workbook.createWorkbook(f1);
		WritableSheet ws1=wk1.createSheet("Assignment5", 0);

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Label L=new Label(j,i,wk);
			}
		}
		
		
		s
	}

}
