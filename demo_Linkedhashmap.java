import java.util.*;
class linkedhashmap
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		System.out.println(lhm.isEmpty());
		lhm.put(100,"Ram");
		lhm.put(200,"Ramesh");
		lhm.put(300,"Nita");
		lhm.put(400,"Amit");
		lhm.put(500,"Aman");
		System.out.println(lhm);
		
	
	}
}