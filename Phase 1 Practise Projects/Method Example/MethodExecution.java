
public class MethodExecution {

public int dividenumbers(int a,int b) {
	int x=a/b;
	return x;
}

public static void main(String[] args) {
	MethodExecution x=new MethodExecution();
	int ans= x.dividenumbers(50,5);
	System.out.println("Division is : "+ans);
}
}
