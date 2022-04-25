public class StringOperations {

	public static void main(String[] args) {
		String s="hzdfgdr";
		String s1=new String("abcdefghd");
		String s2="hzedfgdr";
		//length
		System.out.println("Length is "+s.length());
		//location
		System.out.println("fetch a desired character at a location "+s.charAt(4));
		//index
		System.out.println("fetch index of character "+s.indexOf('b'));
		//lastIndex
		System.out.println("fetch last index of character "+s.lastIndexOf('f'));
		//converting to uppercase
		System.out.println("convert to uppercase "+s.toUpperCase());
		//substring
		System.out.println("substring model 1 is "+s.substring(3));
		System.out.println("substring model 2 is "+s.substring(3,6));
		//equals
		System.out.println("equals "+s.equals(s1));
		//hashcode
		System.out.println(s.hashCode()+"  "+s1.hashCode()+"  "+(s==s1));
		//comparison of strings
		System.out.println("comparison of strings "+s.compareTo(s2));
		//concatenation
		System.out.println("concatenation of string"+s.concat(s2));
				
		//conversion	
		System.out.println("\n");
		System.out.println("//Conversion of Strings to StringBuffer and StringBuilder//");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("**String to StringBuffer**");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("**String to StringBuilder**");
        System.out.println(sbl);              		
	}
}
