import java.util.*;
class hashmap
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<>();
		System.out.println(hm.isEmpty());
		hm.put(100,"Ram");
		hm.put(200,"Ramesh");
		hm.put(300,"Nita");
		hm.put(400,"Amit");
		hm.put(500,"Aman");
		System.out.println(hm);
		System.out.println(hm.entrySet());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsValue("Nita"));
		System.out.println(hm.containsKey("Nita"));
		System.out.println(hm.replace(200,"Ramesh"));
		System.out.println(hm);
		System.out.println(hm.remove(500,"Aman"));
	
	}
	
}