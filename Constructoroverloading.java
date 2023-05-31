package inheritance;

public class Constructoroverloading{
  private int age;
  private String name;
  private String surname;

public Constructoroverloading(int age,String name) {
    this.age=age;
	   this.name=name;
}
public Constructoroverloading(int age,String name,String surname) {
	   this.age=age;
	   this.name=name;
	   this.surname=surname;
}
public String getsur() {
	return surname;
}
public int getage() {
	return age;
}
public String getname() {
	return name;
}
	public static void main(String[] args) {
		Constructoroverloading sc=new Constructoroverloading(20,"charan");
		System.out.println("my name is "+sc.name);
		System.out.println("my age is "+sc.age);
		Constructoroverloading scc=new Constructoroverloading(19,"charan","reddy");
		System.out.println("my name is "+scc.name);
		System.out.println("my age is "+scc.age);
		System.out.println("my surname is "+scc.surname);
		

	}

}
