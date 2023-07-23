import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n3];
        for(int i = 0 ; i<n1;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n2;i++)
        {
            b[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n3;i++)
        {
            c[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n1;i++)
        {
            for(int j = 0 ; j<n2;j++)
            {
                for(int k = 0 ; k<n3;k++)
                {
                    if(a[i] == b[j] && a[i] == c[k])
                    {
                        System.out.print(a[i]+" ");
                    }
                }
            }
        }
        sc.close();
    }
}
