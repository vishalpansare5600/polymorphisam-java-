public class student 
{
	int id;
	String name;
	student (int i,String n)
	{
	id=i;
	name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		student s2=new student(1,"ganesh");
		student s3=new student (2,"vishal");
		s2.display();
		s3.display();
	}
}