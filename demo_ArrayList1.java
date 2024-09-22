import java.util.*;
class demomethod
{
	public static void main(String args[])
	{
		ArrayList <String> al=new ArrayList <>();
		al.add("Nayan");
		al.add("Sourabh");
		al.add("Tushar");
		System.out.println(al.indexOf("Tushar"));
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}
}