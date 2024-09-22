import java.util.*;
class vectorprogram
{
	public static void main(String arg[])
	{
		Vector<String>vec=new Vector<>();
		System.out.println(vec.capacity());
		vec.add("Jai");
	    vec.add("Shree");
	    vec.add("Ram");
		System.out.println(vec);
		System.out.println(vec.capacity());
		System.out.println(vec.size());
		//vec.hashCode();
		System.out.println(vec.lastElement());
		System.out.println(vec.firstElement());
		System.out.println(vec.indexOf("Ram"));
	}
}