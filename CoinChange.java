import java.util.Scanner;
public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int count =0 ;
        for(int i = 0; i<n; i++)
        {   for(int j = 0 ;j<n;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    count++;
                    System.out.println(arr[i]+" "+arr[i]);
                }
            }
            
        }
        System.out.println(count);    
        sc.close();
    }
}
