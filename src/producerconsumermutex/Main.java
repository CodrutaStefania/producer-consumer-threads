package producerconsumermutex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;


public class Main {
	public static int count=10;
	public static Queue<Integer> coada = new LinkedList();
	public Lock lock;
	public static void main(String[] args) throws InterruptedException {
		Producer producer = new Producer(count);
	    Consumer consumer = new Consumer(count);
		Thread t1 = new Thread(producer);
	    Thread t2 = new Thread(consumer);
	    t1.start();
	    t2.start();

}
}
