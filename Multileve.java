package inheritance;
import java.util.Scanner;
class parent1{
	int age=20;
}
class subchild extends parent{
	String name="charan";
}
public class Multileve extends subchild{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multileve sr=new Multileve();
		System.out.println("My name is "+sr.name+" and my age is "+sr.age+"");

	}

}
