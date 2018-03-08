package producerconsumermutex;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
public class Producer implements Runnable 
{
	Random numar = new Random();
	int count;
	ReentrantLock lock = new ReentrantLock();
	public Producer(int count) {
		super();
		this.count = count;
	}
	
	@Override
	public void run() {
		int sizeOfQueue=Main.coada.size();
		int ok=0;
		while(ok<10)
		{
		if(sizeOfQueue<count)
		{
			ok++;
            lock.lock();
				try {
					int n=numar.nextInt(50);
					Main.coada.add(n);
					System.out.println("Am adaugat numarul"+n);
				} finally {lock.unlock();
				}
		}
		
		}
		
	}
	

}
