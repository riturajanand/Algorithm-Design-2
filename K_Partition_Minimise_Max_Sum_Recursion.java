import java.util.Scanner;
public class K_Partition_Minimise_Max_Sum_Recursion 
{
   public static int maxSum(int arr[],int sum[],int n,int start,int cuts)
   {
	    if(cuts==0)
	    {
	    	if(n==1)
	    		return arr[0];
	    	else 
	    		return sum[n-1]-sum[start-1];
	    }
	    int end=n-cuts;
	    int subVal=0;
	    int mxSum=Integer.MAX_VALUE;
	    if(start!=0)
	    	subVal=sum[start-1];
	    for(int i=start;i<end;i++)
	      mxSum= Math.min(mxSum, Math.max(sum[i]-subVal,maxSum(arr,sum,n,i+1,cuts-1)));
	    return mxSum;	
   }
   public static void main(String[] args) 
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the number of elements:");
	   int n=input.nextInt();
	   int arr[]=new int[n];
	   int sum[]=new int[n];
	   System.out.println("Enter the elements in the array:");
	   for(int i=0;i<n;i++)
		   arr[i]=input.nextInt();
	   sum[0]=arr[0];
	   for(int i=1;i<n;i++)
	   {
		   sum[i]=sum[i-1]+arr[i];
	   }
	   System.out.println("Enter the valueof k:");
	   int k=input.nextInt();
	   System.out.println(maxSum(arr,sum,n,0,k-1));
   }
}
