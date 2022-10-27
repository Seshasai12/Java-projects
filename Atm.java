package maccess;
import p1.pincheck;

import java.util.Scanner;
import java.util.concurrent.*;
import p4.*;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int Count=0;
	while(true) {
		System.out.println("Enter the pinNo:");
		String pinNo=s.nextLine();
		if(pinNo.length()==4)
		{
			int pin=Integer.parseInt(pinNo);
			pincheck PC=new pincheck();//object
			boolean Z=PC.Verify(pin);
			if(Z)
			{
				System.out.println("----CHOICE----");
				System.out.println("1.withdreaw\n2.Deposit\n3.payment");
				System.out.println("Enter the choice");
				int choice=Integer.parseInt(s.nextLine());
				switch(choice){
					case 1://withdraw
						Withdraw wd=new Withdraw();//object
				System.out.println("Enter the amt:");
						 int amt1=Integer.parseInt(s.nextLine());
					if(amt1>0 && amt1%100==0)
					{
						wd.process(amt1 );
					}//end of if
					else
					{
						System.out.println("Invalid Amt");
					}
				break;
				case 2://Deposit
					Deposit d=new Deposit(); //object
				System.out.println("Enter the amt:");
				int amt2=Integer.parseInt(s.nextLine());
				if(amt2>0 && amt2%100==0)
				{
					d.process(amt2);;
				}
				else
				{
					System.out.println("Invalid amt");
				}
				break;
				case 3://payment
				Payment p1=new Payment(); //object
				System.out.println("Enter the amt:");
				float amt3=Float.parseFloat(s.nextLine());
				if(amt3>0)
				{
					p1.process(amt3);
				}//end of if
				else
				{
					System.out.println("Invalid amt");
				}
				break;
				default:
				System.out.println("pinNo donot exist");
				Count++;
				}
			}//end of if
			else
			{
				System.out.println("Invalid pinNo");
				Count++;
			}
			if(Count==3)  //simple if
			{
				System.out.println("sorry|Transaction Blocked Temporarly");
				break;
				}
			}
	}
	}
	
	}

		
		
			
				
					
						
				
			
		
	



