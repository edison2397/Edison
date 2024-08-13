package corejava;

import java.util.Scanner;

class Switchcase1 {

	public static void main(String[] args) {
		double num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers:");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		System.out.println("enter the operators(+,-,*,/)");
		char op=scan.next().charAt(0);
		double o;
		switch(op)
		{
		case '+':
			o=num1+num2;
			System.out.println("add="+o);
			break;
		case '-':
			o=num1-num2;
			System.out.println("sub="+o);
			break;
		case '*':
			o=num1*num2;
			System.out.println("mul="+o);
			break;
		case '/':
			o=num1/num2;
			System.out.println("div="+o);
			break;
		default:
			System.out.println("none of the numbers");
		}
		
		// TODO Auto-generated method stub

	}

}
