//DEMOSTRATION STRING POOL
class StringPool{
	public static void main(String[] args){
		String s1="hello";//String Create Using Literal
		String s2=new String("hello");//String Create Using new Keyword
		String s3=s2.intern();
		String s4="hel"+"lo";
		String s5="lo";
		String s6="hel"+s5;
		String s7="hel";
		String s8=s7+"lo";
		String s9="hel"+s5;
		System.out.println("s1==s2?"+(s1==s2));
		System.out.println("s1==s2.intern()?"+(s1==s3));
		System.out.println("s1==s4?"+(s1==s4));
		System.out.println("s1==s6?"+(s1==s6));
		System.out.println("s4==s6?"+(s4==s6));
		System.out.println("s9==s6?"+(s6==s9));
		System.out.println("s6==s8?"+(s6==s8));
		System.out.println("s6.intern()==s9.intern()?"+(s6.intern()==s9.intern()));
		System.out.println("s6.intern()==s8.intern()?"+(s6.intern()==s8.intern()));
	}
}
