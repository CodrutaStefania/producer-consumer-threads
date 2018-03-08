package producerconsumermutex;
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
		boolean ok=true;
		while(ok)
		{
			lock.lock();
		
            
				try {
					if(sizeOfQueue<count)
					{
					int n=numar.nextInt(50);
					Main.coada.add(n);
					System.out.println("Am adaugat numarul"+n);
					}
				} finally {lock.unlock();          
				}
		}
		
		}
		
	}
	

}
