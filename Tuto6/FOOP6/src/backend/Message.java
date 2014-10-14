package backend;

import java.util.Random;

public class Message implements Runnable {
	
	private String msg;
	private int num;
	
	public Message(String m, int n) {
		msg=m;
		num=n;
	}

	@Override
	public void run() {
		Random r=new Random();
		for (int i = 0; i < num; ++i) {
			 System.out.println(msg + " " + i) ;
			 long tmp=r.nextLong()%10000;
			 try {
				if (tmp<0)
					Thread.sleep(tmp*-1);
				else
					Thread.sleep(tmp);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Message m1=new Message("Twelve", 12), m2=new Message("Five", 5), m3=new Message("Eight", 8);
		Thread t1=new Thread(m1), t2=new Thread(m2), t3=new Thread(m3);
		
		t1.start(); t2.start(); t3.start();
	}
	
}
