import java.util.*;
class Hashset
{
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Bhopal");
		hs.add("Surat");
		hs.add("Indore");
		hs.add("Agra");
		hs.add("Surat");
	    System.out.println(hs);
		hs.clear();
		int i=hs.size();
		System.out.println(i);
		System.out.println(hs.contains("Agra"));
		System.out.println(hs.isEmpty());
		hs.remove("Agra");
		System.out.println(hs);
	
	}
}