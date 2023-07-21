import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        for(int i =0;i<5;i++)
        {
            A[i] = sc.nextInt();
        }
        int[] B = new int[10];
        for(int i = 0; i<5;i++)
        {
            B[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        for(int i = 0;i<10;i++)
        {
            for(int j = 0; j<10;j++)
            {
                if(A[i] +B[j] ==X)
                {
                    System.out.println(A[i]+" "+B[j]);
                }
            }
        }
        sc.close();
    }
    
}
