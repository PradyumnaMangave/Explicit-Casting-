class NumIterator implements Runnable{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
}

public class threadEx {
	public static void main(String[] args) {
		
		           
		NumIterator num=new NumIterator();
		Thread t=new Thread(num);
		t.start();
	}

}
