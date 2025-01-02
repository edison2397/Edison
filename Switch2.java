package jv;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=3;
		switch(day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wed");
			break;
		case 5:
			System.out.println("Thur");
			break;
		case 6:
			System.out.println("Frid");
			break;
		case 7:
			System.out.println("Sat");
			break;
			
		default://no need to implement break
			System.out.println("Looking Forward for the correct number");
		}
		System.out.println("Your day is"+day);

	}

}
