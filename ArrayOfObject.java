package corejava;

public class ArrayOfObject {
	String name;
	int age;
	String department;
	double salary;
	String position;
	ArrayOfObject(String name,int age,String department,double salary,String position)
	{
		this.name=name;
		this.age=age;
		this.department=department;
		this.salary=salary;
		this.position=position;
	}
	void display()
	{
		System.out.println("emp name is:"+name);
		System.out.println("emp age is:"+age);
		System.out.println("emp department is:"+department);
		System.out.println("emp salary is:"+salary);
		System.out.println("emp position is:"+position);
		
	}
	public class Main
	{
		public static void main(String[]args)
		{
			ArrayOfObject[] arr = new ArrayOfObject[5];
			arr[0]=new ArrayOfObject("edison",26,"IT",25000,"Developer");
			arr[1]=new ArrayOfObject("edison",26,"IT",25000,"Developer");
			arr[2]=new ArrayOfObject("edison",26,"IT",25000,"Developer");
			arr[3]=new ArrayOfObject("edison",26,"IT",25000,"Developer");
			arr[4]=new ArrayOfObject("edison",26,"IT",25000,"Developer");
			for(ArrayOfObject employee:arr)
			{
				employee.display();
			
		}
	}
	}


}
