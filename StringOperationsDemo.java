class A
{
	void m()
	{
		String s1="bc23a";
		String s2="bca";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.indexOf("c"));
		System.out.println(s1.charAt(4));
		//System.out.println(s1.substring(2,6));
		System.out.println(s1.contains("cde"));
		System.out.println(s1.isEmpty());
		System.out.println(s1);
		System.out.println(s1.replaceAll(s1, "7777777"));
		System.out.println(s1);
		System.out.println(s2.toUpperCase());
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println(s2.compareTo(s2));
		
		System.out.println(s1==s2);
		StringBuilder s3=new StringBuilder("xyz");
		StringBuilder s9=new StringBuilder("xyz");
		StringBuffer s4=new StringBuffer("pqr");
		StringBuffer s5=new StringBuffer("pqr1");
		StringBuffer s6=new StringBuffer("pqr2");
		StringBuffer s7=new StringBuffer("pqr33");
		StringBuffer s8=new StringBuffer("pqr33");
		//StringBuffer s4=new StringBuffer("pqr");
		//StringBuffer s4=new StringBuffer("pqr");
		//StringBuffer s4=new StringBuffer("pqr");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s3.length());
		System.out.println(s4.append("a"));
		System.out.println(s4.charAt(3));
		System.out.println(s4.capacity());
		System.out.println(s4.reverse());
		System.out.println(s4.reverse());
		System.out.println(s6.codePointCount(1,2));
		
		
	}
}
public class StringOperationsDemo {

	public static void main(String[] args) {
		A ob=new A();
		ob.m();
	}

}
