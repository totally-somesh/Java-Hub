import java.util.*;
public class Fibonacii {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


int n1,n2,n3,num;
num=sc.nextInt();
n1=0;
n2=1;

System.out.println(n1);
System.out.println(n2);
for (int i=2;i<num;i++)
{
	n3= n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	
	
}
}}