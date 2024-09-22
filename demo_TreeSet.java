import java.util.*;
class Treehash
{
	public static void main(String args[])
	{
		TreeSet<String>ths=new TreeSet<>();
		ths.add("Ankita");
		ths.add("Monika");
		ths.add("Amit");
		ths.add("Ranu");
		ths.add("Suman");
		ths.add("Rohit");
		ths.add("Aman");
		System.out.println(ths);
		System.out.println("Reverse order"+ths.descendingSet());
		System.out.println(ths.headSet("Suman",false));
		System.out.println(ths.tailSet("Suman",true));
		System.out.println(ths.subSet("Monika",false ,"Rohit",true));
		ths.pollFirst();
		System.out.println(ths);
	}
}