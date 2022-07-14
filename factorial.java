import java.util.Scanner;
class MyClass
{
	public static void main(String args[])
	{
		int a,b=1;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println("factorial is "+ b);
	}
};
		