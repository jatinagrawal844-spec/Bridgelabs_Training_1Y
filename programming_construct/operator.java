class Operator
{
public static void main(String args[])
{
	// Assingnment Operator
	int a =10;
	a+=5;
	System.out.println("a+=5:" +a);
	a-=5;
	System.out.println("a-=5:" +a);
	// Relation Operator
	int age = 20;
	if(age >= 18)
	{
		System.out.println("You are allowed");
	}
	else
	{
		System.out.println("You are not allowed");
	}
	// Unary Operator
	int value = 10;
	System.out.println("value++:" + value++);
	System.out.println("value--:" + value--);
}
}