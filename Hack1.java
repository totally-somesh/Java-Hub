import java.util.Scanner;
public class Hack1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	int count=0;
	int n ,i,j;
	n=sc.nextInt();
    int arr[]=new int [9];
    for( i=1;i<=n;i++)
    {
    	arr[i]=sc.nextInt();
    
    }
    for(j=i+1;j<=n;j++)
    {
      if((arr[i]+arr[j])%2==0)
      {
         count++;
        
      }
    	
    }
   if(count==0)
   {
	   System.out.println("it is invalid");
   }
   else {
	   
	   System.out.println("it is valid");
   }

	}

}
