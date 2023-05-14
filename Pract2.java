package ppp;
import java.util.Scanner ;
public class Pract2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int arr[] = new int[5];
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
			count =0;

			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
			
			}
		}
		if(count >0)
		{
		 System.out.println(count);
		}
		
	}

}
