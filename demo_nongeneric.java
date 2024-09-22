import java.util.*;
class Nongeneric
{
	public static void main(String arg [])
	{
        ArrayList al=new ArrayList <>();
	    al.add("Ramesh");
	    al.add("Suresh");
	    al.add(100);
	    String s1=(String)al.get(0);
	    String s2=(String)al.get(1);
	    int s3=(Integer)al.get(2);//type-casting
	    System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}