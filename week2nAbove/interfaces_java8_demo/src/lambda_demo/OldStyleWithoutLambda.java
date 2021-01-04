package lambda_demo;

public class OldStyleWithoutLambda implements HelloFunctionalInterface{

	public static void main(String[] args) {
		
		HelloFunctionalInterface h = new OldStyleWithoutLambda();
		h.hello();
		
		HelloFunctionalInterface h2 = new HelloFunctionalInterface() {
			
			@Override
			public void hello() {
				System.out.println("Hello from inner");
				
			}
		};
		
		h2.hello();
		
		HelloFunctionalInterface h3 = new HelloFunctionalInterface() {
			
			@Override
			public void hello() {
				System.out.println("Hello again from inner");
				
			}
		};
		
		h3.hello();
		
		System.out.println(h3.getClass());

	}

	@Override
	public void hello() {
		
		System.out.println("Hello old style");
	}

}
