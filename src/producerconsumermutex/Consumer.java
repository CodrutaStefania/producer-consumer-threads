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
		int ok=0;
		while(ok<6)
		{
		if(sizeOfQueue>0)
		{
			ok++;
			lock.lock();
				try {
				 
					Main.coada.remove();
				    System.out.println("Am eliminat elementul");
				} finally {lock.unlock();
					
				}
		}
		
		}
		
	}

}
