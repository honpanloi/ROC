package implementing_runnable_interface;

public class MyRun implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Printing from thread: "+Thread.currentThread().getName()+" Value of i: "+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
