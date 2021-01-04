package lambda_demo;

public class LambdaStyleMain {

	public static void main(String[] args) {
		HelloFunctionalInterface h1 = ()->System.out.println("Hello Lambda");
		h1.hello();
		
		HelloFunctionalInterface h2 = ()->{
			System.out.println("Hello again");
			System.out.println("Hello again and again");
		};
		
		h2.hello();
		
		HelloInterfaceFunctional h3 = (n)->{
			System.out.println("Hello "+n);
		};
		
		h3.sayHelloByName("Tifa");
		
		
		AddFunctional a = (x,y,z)->{
			return x+y+z;
		};
		
		System.out.println("result is "+a.sum(4, 5, 6));

	}
}
