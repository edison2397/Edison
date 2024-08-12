package javafs;

abstract class Animal {
abstract void sound();
}
 class Lion extends Animal
 {
	 public void sound()
	 {
		 System.out.println("lion is coming");
	 }
 }
    
class Tiger extends Animal
 {
	public void sound()
 
	 {
		 System.out.println("tiger is alive");
		 
	 }
class Common
{
 public static void main(String[] args) {
		{
		Tiger obj=new Tiger();
		obj.sound();
		Lion ob=new Lion();
		ob.sound();
		ob.sound();
		
		}
 }
 }
 }
	
