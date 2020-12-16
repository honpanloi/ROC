package eg1;

public class Demo1 {

	public static void main(String[] args) {

		int ar[] = {1,3,5,62,3245,7,345,2,6,12,5};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		
		
		int[] ar1 = new int[10];
		System.out.println("\nPrinting contents of ar1");
		
		for (int x : ar1) {
			System.out.print(x+" ");
			
		}
		
		System.out.println();
		ar1[0]=22;
		ar1[1]=22;
		ar1[2]=22;
		ar1[3]=22;
		ar1[4]=22;
		
		int n = 5;
		
		System.out.println("\nPrinting contents of ar1 before insertion");
		
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		System.out.println();
		
		int pos = 1;
		int ele = 999;
		
		for (int i = n; i >= pos; i--) {
			ar1[i] = ar1[i-1];
		}
		
		ar1[pos -1] = ele;
		n++;
		
		System.out.println("\nPrint contents of ar1 after insertion");
		
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		int delpos = 1;
		for (int i = delpos-1; i < n; i++) {
			ar1[i]= ar1[i+1];
		}
		
		n--;
		
		System.out.println("\n\nPrint contents of ar1 after deletion");
		
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
	}

}
