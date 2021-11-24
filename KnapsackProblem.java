import java.util.Scanner;
public class KnapsackProblem 
{
	public static int knapsackProblem(int weight[],int val[],int n,int w)
	{
		int arr[][]=new int[n][w+1];
		for(int i=0;i<=w;i++)
		{
			if(i<weight[0])
				continue;
			arr[0][i]=val[0];
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<=w;j++)
			{
				if(j<weight[i])
					arr[i][j]=arr[i-1][j];
				else
					arr[i][j]=Math.max(arr[i-1][j],val[i]+arr[i-1][j-weight[i]]);
			}
		}
		return arr[n-1][w];
	}
    
	public static void main(String[] args) 
	{
	   
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n=input.nextInt();
		
		int val[]=new int[n];
		int weight[]=new int[n];
		
		System.out.println("Enter the value of the item with their weight:");
        for(int i=0;i<n;i++) 
        {
           weight[i]=input.nextInt();
           val[i]=input.nextInt();
        }
        
        System.out.println("Enter the maximum weight allowed:");
        int w=input.nextInt();
        
        System.out.println("Max value is:"+knapsackProblem(weight,val,n,w));
	}

}
