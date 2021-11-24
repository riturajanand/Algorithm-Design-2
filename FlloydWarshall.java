import java.util.Scanner;
public class FlloydWarshall 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=5;
		double inf=Double.POSITIVE_INFINITY;
		
	    double arr[][]= {{0,3,8,inf,-4},{inf,0,inf,1,7},{inf,4,0,inf,inf},{7,inf,-5,0,inf},{inf,inf,inf,6,0}};
	    		   
	    
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		for(int k=0;k<n;k++)
	    			arr[j][k]=Math.min(arr[j][k], arr[j][i]+arr[i][k]);
	    	}
	    	System.out.println("D"+(i+1));
	    	for(int x=0;x<n;x++)
	    	{
	    		for(int y=0;y<n;y++)
	    			System.out.print((int)arr[x][y]+" ");
	    		System.out.println();
	    	}
	    		
	    }

	}

}
