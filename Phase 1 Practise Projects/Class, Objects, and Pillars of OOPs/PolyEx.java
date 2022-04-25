class ArgEx{

	void args() {

		System.out.println("no args");

	}

	void args(int a,int b) {

		System.out.println("2 args of int");

	}

	void args(double a,double b) {

		System.out.println("2 args of double type");

	}

}
public class PolyEx {
public static void main(String[] args) {
	ArgEx ex=new ArgEx();
	ex.args(10.0,20);

	}

}