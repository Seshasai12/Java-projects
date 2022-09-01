package Input;

public class Student {
	int rollno;        //instance variable
	String name;
	static String college="A.V.Clg";   //static variable
	//constructor
	Student(int r,String n)
	{
		rollno=r;
		name=n;}//method to display the values
	void display() {           //call function
		System.out.println(rollno+" "+name+" "+college);}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"sai");//object creation
		Student s2=new Student(222,"seshu");//object creation
		Student s3=new Student(10,"Amarender");//object creation
		Student s4=new Student(46,"shubham raj");//object creation
		s2.display();//method call
		s1.display();//method call
		s3.display();//method call
		s4.display();//method call
		
	
	}

}
