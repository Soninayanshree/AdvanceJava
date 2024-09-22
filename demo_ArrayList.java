import java.util.*;
class generic
{
	public static void main(String args[])
	{
		ArrayList <String> al=new ArrayList <>();
		al.add("Nayan");
		al.add("Sourabh");
		al.add("Tushar");
		al.add("Ankit");
		al.add("Lokesh");
		al.add("Komal");
		System.out.println(al);
		al.remove("Komal");
		String St=al.get(2);
		al.set(2,"Deepti");
		System.out.println(al);
		System.out.println(St);
	}
}