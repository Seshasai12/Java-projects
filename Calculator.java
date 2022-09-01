import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {

	    int operator;
	    int number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: (1:Add),(2:sub),(3,mul), or(4:Div)");
	    operator = input.nextInt();

	    // ask users to enter numbers
	    System.out.println("Enter first number:");
	    number1 = input.nextInt();

	    System.out.println("Enter second number:");
	    number2 = input.nextInt();

	    switch (operator) {

	      // performs addition between numbers
	      case 1:
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case 2:
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case 3:
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case 4:
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
	}

