import java.util.*;
class Linked
{ 
public static void main(String args[])
{
	LinkedList<String> list=new LinkedList<>();
	list.add("Keyboard");
	list.add("Mouse");
	list.add("Barcode Reader");
	list.add("Scanner");
	list.add("Mouse");
	System.out.println(list);
	list.addFirst("Scanner");
	list.addLast("Scanner");
	System.out.println(list);
	list.removeFirstOccurrence("Scanner");
	list.removeLastOccurrence("Scanner");
	System.out.println(list);
	System.out.println(list.peekFirst());
	System.out.println(list.peekLast());
	System.out.println(list.pollFirst());		
	System.out.println(list.pollLast());
	System.out.println(list);
	LinkedList <String> list1=new LinkedList<>();
	list1.add("printer");
	list1.add("Mouse");
	list1.add("Barcode Reader");
	list.addAll(1,list1);
	System.out.println(list);
	
}
 
}