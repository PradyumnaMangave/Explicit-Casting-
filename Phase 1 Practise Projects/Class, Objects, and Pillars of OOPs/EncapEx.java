class Employee1{	
	private	int empno;
	private	String empname;
	public int getEmpno() {	
		return empno;
		}
	public void setEmpno(int empno) {	
		this.empno = empno;
		}
	public String getEmpname() {
		return empname;
		}
	public void setEmpname(String empname) {	
		this.empname = empname;
		}
	@Override public String toString() {	
		return "Employee1 [empno=" + empno + ", empname=" + empname + "]";}
	}
public class EncapEx {
	public static void main(String[] args) {
		Employee1 e=new Employee1();	
		e.setEmpno(101);	
		e.setEmpname("karthik");	
		System.out.println(e);
		}
	}