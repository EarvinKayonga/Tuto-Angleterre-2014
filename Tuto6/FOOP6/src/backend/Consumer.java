package backend;

import java.util.Random;

public class Consumer implements Runnable {

	private Buffer buff;
	private int num;
	
	public Consumer(Buffer b, int n) {
		buff=b;
		num=n;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		long tmp;
		for (int i=1; i<=5; i++) {
			tmp=r.nextLong()%10000;
			try {
				buff.getNext(num);
			if (tmp<0)
					Thread.sleep(tmp*-1);
				else
					Thread.sleep(tmp);
		 	} catch (InterruptedException e) {
			// 	TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
