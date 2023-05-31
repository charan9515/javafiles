package inheritance;

class Fathe{
	String name="cbit";
}
class son extends Fathe{
	int age=20;
}
class d extends Fathe{
	int age1=19;
}


public class Father {
	public static void main(String[] args) {
		son sc=new son();
		d dc=new d();
		System.out.println(sc.name);
		System.out.println(sc.age);
		System.out.println(dc.age1);
		System.out.println(dc.name);
	
		

	}

}


