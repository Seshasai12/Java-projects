import java.util.*;
import java.util.Scanner;
class Addition{
	void add(int x,int  y) {
		System.out.println("Sum:"+(x+y));
	}
}
class Subraction{
	void sub(int x,int y) {
		System.out.println("Sub:"+(x-y));
	}

	
		
	}

class Multiplication{
	void mul(double x,double y) {
		System.out.println("Multi:"+(x*y));
	}
}
class Division{
	void div(float x,float y) {
		System.out.println("Div:"+(x/y));
	}
}
class ModDivision{
	void mod(int x,int y) {
		System.out.println("Mod:"+(x%y));
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated metho)d stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the value1:");
int a=Integer.parseInt(s.nextLine());

System.out.println("Enter the value2:");
int b=Integer.parseInt(s.nextLine());
System.out.println("******CHOICE******");
System.out.println("1.Add/n2.Sub/n3.mul/n4.div/n5.mod");
System.out.println("Enter the choice:-");
int choice=Integer.parseInt(s.nextLine());
switch(choice)
	{
case 1:
	Addition a1=new Addition();
	a1.add(a,b); //method call
	break;
case 2:
	Subraction b1=new Subraction();
	b1.sub(a,b); //method call
	break;
case 3:
	Multiplication m=new Multiplication();
	m.mul(a,b); //method call
	break;
case 4:
	Division d=new Division();
	d.div(a,b); //method call
	break;
case 5:
	ModDivision md=new ModDivision();
	md.mod(a,b); //method call
	break;
	default:
		System.out.println("Invalid choice?");
		
	
	
	}//end of switch
	}

}
