package excelDataDriven;

public class DataManagement {

	public static void main(String[] args) throws Exception
	{

	ExcelAPI e = new ExcelAPI("E:\\march automation\\suitea.xlsx");
	
	String sheetName = "Data";
	
	String testCaseName = "TestB";
	
	
	int testStartRowNum = 0;
	
	while(e.getCellData(sheetName, 0,testStartRowNum).equals(testCaseName));
	{
		
		testStartRowNum++;
		
		
	}
	
	System.out.println("Test START FROM ROW :" +testStartRowNum);
	
	
	
	
	
	}

}
