package inheritance;
import java.util.Scanner;

   class parent{
	   int age=20;
//	   public void pri() {because it is not parameter and no return type
	   public void pri() {
		   System.out.println("hi i am");
	   }
   }
	
   public class Inherit extends parent{
	public static void main(String[] args) {
		Inherit sr=new Inherit();
	
		System.out.println(sr.age);
		sr.pri();

	}

}
