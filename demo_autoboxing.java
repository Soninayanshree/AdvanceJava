class Autoboxing
{
	public static void main (String args[])
	{
		int a=10;
		Integer b=Integer.valueOf(a);//before Java5
		Integer c=a;//After Java5
		System.out.println(a +""+c);
	}
}