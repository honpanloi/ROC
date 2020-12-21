package eg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accessing Implementor using MyInterface1");
		
		MyInterface1 i1 = new Implementer();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.method4();
		i1.common();
		
		MyInterface2 i2 = new Implementer();
		i2.call1();
		i2.call2();
		i1.common();
	}

}
