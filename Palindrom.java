import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);


int num,temp;
num=sc.nextInt();
int rem;
int sum=0;
temp=num;

while(num>0)
{
	rem= num%10;
	sum= (sum*10)+rem;
	num=num/10;
	
}
if (temp==sum)
{
	System.out.println("palindrom");
}
else {
	System.out.println("not");
}

	}

}
