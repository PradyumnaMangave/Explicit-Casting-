class Employee{	
	int empno=11;	
	String empname="prasad";	
	void display() {		
		System.out.println(empno+"  "+empname);	}	
	}

public class Main {
	public static void main(String[] args) {	
		Employee e=new Employee();
		System.out.println(e.empno);
		System.out.println(e.empname);
		
}
	}