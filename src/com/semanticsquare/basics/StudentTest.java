import java.math.BigDecimal;

class Student{
	int rollno;
	String name;
	String gender;
	void insertrecord(String n,int r,String gn)
	{
		rollno=r;
		gender=gn;
		name=n;
	}
	void display()
	{
		System.out.println("NAME : "+name+", ROLL : "+rollno+", GENDER : "+gender);
	}
}
public class StudentTest{
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.insertrecord("BISWA",1001,"MALE");
		s2.insertrecord("ROMI",1002,"FEMALE");
		s1.display();
	    s2.display();
		BigDecimal first = new BigDecimal("0.3");
		BigDecimal second = new BigDecimal("0.2");
		System.out.println(first.add(second));
	}
}