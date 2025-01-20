package javapractiseprogram;

public class StringMethodsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Append method
	   int b=20;
	   String s=String.valueOf(b);
	   System.out.println(s);
	   //Append method
	   StringBuffer s1=new StringBuffer("Hai");
	   s1.append("frnds");
	   System.out.println(s1);
	   //Insert method
	   s1.insert(1, "everyone");
	   System.out.println(s1);
	   //Delete method
	   s1.delete(1, 9);
	   System.out.println(s1);
	   //Reverse method
	   s1.reverse();
	   System.out.println(s1);

	}

}
