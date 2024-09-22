import java.util.*;
class stackprogram
{
	public static void main(String arg[])
	{
		Stack <String> st=new Stack<>();
		System.out.println(st.empty());
		st.push("Ram");
		st.push("Rita");
		st.push("Radha");
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search("Ram"));
		st.pop();
		System.out.println(st);
		//System.out.println(st.empty());
	}
}