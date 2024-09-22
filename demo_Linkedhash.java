import java.util.*;
class Student
{
	int rollno,marks;
	Student(int rollno,int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
	}
}
class  Linkedhash
{
	public static void main(String args[])
	{
		LinkedHashSet<Student>lhs=new LinkedHashSet<>();
		Student st=new Student(101,256);
		Student st1=new Student(345,104);
		Student st2=new Student(103,400);
		lhs.add(st);
		lhs.add(st1);
		lhs.add(st2);
		System.out.println("rollno"+" "+"marks");
		for(Student s:lhs)
		{
		    System.out.println(s.rollno+" "+s.marks);	
		}
		
	}
}