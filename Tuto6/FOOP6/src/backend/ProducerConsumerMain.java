package backend;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		Buffer b = new Buffer(2);
		Producer p1 = new Producer(b, 1);
		Producer p2 = new Producer(b, 2);
		Consumer c1 = new Consumer(b, 1);
		Consumer c2 = new Consumer(b, 2);
		Thread tp1=new Thread(p1), tp2=new Thread(p2), tc1=new Thread(c1), tc2=new Thread(c2);
		tp1.start();
		tp2.start();
		tc1.start();
		tc2.start();
	}
}
