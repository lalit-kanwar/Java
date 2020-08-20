package OOps.test;

class A{
	static {
		System.out.println("A class");
	}
	void m1(){
		System.out.println("A m1");
	}
	void m2(){
		System.out.println("A m2");
	}
}
class B extends A{
	static {
		System.out.println("B class");
	}
	void m1(){
		System.out.println("B m1");
	}
	void m3(){
		System.out.println("B m3");
	}
}
public class SubClassMethodTest {

	public static void main(String[] args) {
A a=new B();
a.m1();
a.m2();
System.out.println();
B b=new B();
b.m1();
b.m2();
b.m3();
System.out.println("main end");
		
	}

}
