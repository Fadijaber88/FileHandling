package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteUponRange 
{
	public void WriteData(int Rowno, int Colno) throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../XlsFileAssignments/Practice3.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f);
		WritableSheet ws= wk.createSheet("Assignment4", 2);
		
		for(int i=1;i<=Rowno;i++)
		{
			for(int j=0;j<=Colno;j++)
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Please enter the data");
				String s1=s.next();
				Label L=new Label(j,i,s1);
				ws.addCell(L);
			}
		}
		wk.write();
		wk.close();
	}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		WriteUponRange r=new WriteUponRange();
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the RowCount and ColCount");
		int a=s.nextInt();
		int b=s.nextInt();
		
		r.WriteData(a, b);

	}

}

