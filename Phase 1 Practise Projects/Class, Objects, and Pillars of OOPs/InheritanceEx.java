class Bike{

	int speed=200;

}

class R15 extends Bike{

	void speedR15() {

		System.out.println(speed+150);

	}

}

public class InheritanceEx {

	public static void main(String[] args) {

		R15 r15=new R15();

		r15.speedR15();

	}



}