package producerconsumermutex;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable{

	public Consumer(int count) {
		this.count = count;
	}
	int count;
	ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		int sizeOfQueue=Main.coada.size();
		boolean ok=true;
		while(ok)
		{
		if(sizeOfQueue>0)
		{
			lock.lock();
				try {
				 
					Main.coada.remove();
				    System.out.println("Am eliminat un element");
				} finally {lock.unlock();
					
				}
		}
		
		}
		
	}

}
