package eg2;

public class DemoSearch {

	public static void main(String[] args) {
		int ar[] = {12,5,523,6725,75684,34};
		boolean b = false;
		
		int searchElement = 5;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == searchElement) {
				b = true;
				break;
			}
		}
		
		if(b) {
			System.out.println(searchElement + " found");
		}else {
			System.out.println(searchElement + " not found");
		}
		
		b = false;
		
		searchElement = 6725;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == searchElement) {
				b = true;
				//break;
				System.out.println(searchElement + " found at postion "+ (i+1));
			}
		}
		
		if(!b) {
			System.out.println(searchElement + " not found");
		}

	}

}
