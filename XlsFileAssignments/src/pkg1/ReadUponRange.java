	package pkg1;

	import java.io.File;
	import java.io.IOException;

	import jxl.Cell;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;
	import jxl.write.WriteException;
	import jxl.write.biff.RowsExceededException;

	public class ReadUponRange 
	{
		public void excelReadRownoColno(int Rowno1, int Rowno2) throws BiffException, IOException
		{
			File f=new File("../XlsFileAssignments/Practice1.xls");
			Workbook wk=Workbook.getWorkbook(f);
			Sheet ws=wk.getSheet(0);
			int row=ws.getRows();
			int colomn=ws.getColumns();
			
			for(int i=0;i<row;i++)
			{
				if (i>=Rowno1 & i<=Rowno2)
				for(int j=0;j<colomn;j++)
				{
					{
					Cell c1=ws.getCell(j, i);
					System.out.println(c1.getContents());
					}
				}
			}
			
			
		}
		public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
		{
			ReadUponRange ex=new ReadUponRange();
			ex.excelReadRownoColno(2,2);
		}
		

	}

