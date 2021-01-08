package extending_thread_class;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		//System.out.println(Thread.currentThread());
		
		//System.out.println("Printing from thread: "+Thread.currentThread().getName()+" Id is: "+Thread.currentThread().getId());
	
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
