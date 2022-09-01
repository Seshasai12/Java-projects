package StringBuffer;

public class Stbuffer1 {
	
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");//now original string is changed 
sb.delete(1,1);
sb.insert(1,"Hello");
sb.replace(1,2, "Hello");
System.out.println(sb);//prints Hello Java  
}  
}  

