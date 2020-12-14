package eg1;
import eg2.AnotherPack;

public class HelloMethod {

	public static void main(String[] args) {
		
		//method name directly if the static method is of same class
		iAmStatic();
		iAmStatic("Leon");
		
		//Classname.methodName() to access static methods of different class
		Another.iAmStaticAnother();
		Another.iAmStaticAnother("Hellen");
		
		AnotherPack.iAmStaticAnother();
		AnotherPack.iAmStaticAnother("Chole");
		
		//classname objname = new(dynamic memory allocation) Constructor();
		HelloMethod h = new HelloMethod(); //Instantiation or object creation
		h.iAmNotStatic();
		h.iAmNotStaticAgain();
	}
	
	public static void iAmStatic() {
		System.out.println("Hello static");
	}
	
	public static void iAmStatic(String name) {
		System.out.println("Hello static by name and name = " + name);
	}
	
	public void iAmNotStatic() {
		System.out.println("Non static method of HelloMethod class");
	}
	
	public void iAmNotStaticAgain() {
		System.out.println("Non static method of HelloMethod class again");
	}

}
