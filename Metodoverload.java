package inheritance;

public class Metodoverload {
	
	public void over(String d) {
		
	}
	public void over(int a) {
		System.out.println(a);
	}
	public void over(int b,String c) {
		System.out.println("name is "+c+" age "+b);
	}
	public void over(String e,int f) {
		System.out.println("name is "+e+" age "+f);
	}

	public static void main(String[] args) {
		Metodoverload sc=new Metodoverload();
		sc.over("cbit");
		sc.over("king jonthedon",20);
		sc.over("cbit");
		sc.over("no1",18);
		sc.over("cbit");
		sc.over("no2",16);

	}

}
