public class arraysOp {
public static void main(String[] args) {
	int a[]=new int[5];
	int b[]=new int[] {2,3,4,5,6,7,8,9};
	System.out.println(a.length);
	System.out.println(b.length);
	//2 ways for , for-each
	
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
	for(int j:b) {
		System.out.println(j);
	}
}
}
