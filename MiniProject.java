import java.util.Scanner;

public class MiniProject 
{
	int row, column;
	String[][] grid;
	
	int exchange1x = 0;
	int exchange1y = 0;
	int exchange2x = 0;
    int exchange2y = 0;
    int gridSizex = 0;
    int gridSizey = 0;
    int exchange1ID = 0;
    int exchange2ID = 0;
	
	public static void main(String args[])
	{
		MiniProject project = new MiniProject();
		
		project.gridCreate();
		//project.exchangePopulate();
		//project.distanceCalculate();
		System.out.println("Exchange 1 x = " + project.exchange1x + " y = " + project.exchange1y + " Unique ID = " + project.exchange1ID);
		System.out.println("Exchange 2 x = " + project.exchange2x + " y = " + project.exchange2y + " Unique ID = " + project.exchange2ID);
		System.out.println("Grid x size is " + project.gridSizex + " " + "Grid y size is " + project.gridSizey);
		
		
	}
	public void gridCreate()
	{
		Scanner gridSize = new Scanner(System.in);
		System.out.println("Enter grid x size ");
		gridSizex = gridSize.nextInt();
		System.out.println("Enter grid y size ");
		gridSizey = gridSize.nextInt();
		
		exchangePopulate();
	}
	public void exchangePopulate()
	{
		Scanner exchangeLocation = new Scanner(System.in);
		
		System.out.println("Enter Exchange 1's unique ID");
		exchange1ID = exchangeLocation.nextInt();
		System.out.println("Enter Exchange 1's x coordinate");
		exchange1x = exchangeLocation.nextInt();
		System.out.println("Enter Exchange 1's y coordinate");
		exchange1y = exchangeLocation.nextInt();
		
		System.out.println("Enter Exchange 2's unique ID");
		exchange2ID = exchangeLocation.nextInt();
		System.out.println("Enter Exchange 2's x coordinate");
		exchange2x = exchangeLocation.nextInt();
		System.out.println("Enter Exchange 2's y coordinate");
		exchange2y = exchangeLocation.nextInt();
		
	}
//	public void distanceCalculate()
//	{
//		double a, b;
//		a = b = 0;
//		
//		a = Math.sqrt((x1*x1)+(y1*y1));
//		b = Math.sqrt((x2*x2)+(y2*y2));
//		
//		if(a > b)
//			System.out.println("exchange name 1");
//		else if(a == b)
//			System.out.println("exchange name 1 and 2 are equidistant");
//		else
//			System.out.println("echange name 2");
//	}
}
