class Unboxing
{
	public static void main(String args[])
	{
		Integer a=100;
		int b=a.intValue();//befor java5
		int c=a;//after java5
		System.out.println(b+" "+c);
	}
}