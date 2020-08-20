package instance.test;


class A{
	static{
		System.out.println("A class");
	}
}
class B extends A{
	static {
		System.out.println("B class");
	}
	
}
class C extends B{
	static {
		System.out.println("C class");
	}
}
class D extends C{
	static {
		System.out.println("D class");
	}
}


public class incetenceOperatorTest {

	public static void main(String[] args){
		Object obj=new B();
		B b=(B)obj;
	//	C c=(C)obj;  //class cast Exception
		System.out.println(obj instanceof C);
	}
}
