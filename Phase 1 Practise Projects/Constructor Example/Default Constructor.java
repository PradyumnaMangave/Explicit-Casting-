//default construtor

class employee{
	int empno=93;
	String empname="Pradyumna";
	
	void display() {
		System.out.println(empno+" "+empname);
		}
	}



public class employeeInfo {
   public static void main(String[] args) {
	   employee e=new employee();
	   e.display();
;
}
}
