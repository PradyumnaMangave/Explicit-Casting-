//parameterized constructor


class empSalary{
	String name;
	double salary;
	

	empSalary(String n,double i)
	{
	name=n;
	salary=i;
	
	}

	void display() {
	System.out.println(name+" "+salary);
	}
}

public class Main {
public static void main(String[] args) {

	empSalary e=new empSalary("Rahul",55000);
	empSalary e1=new empSalary("Rohit",53000);
	e.display();
	e1.display();
		}
}
