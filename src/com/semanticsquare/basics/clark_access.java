public class clark_access{
	public static void main(String[] args){
		clark c1=new clark(1001,"BISWA","CEO");
		clark c2=new clark(1002,"ANKITA","ASSISTANT_CEO");
		clark c3=new clark(1002,"ANKITA","ASSISTANT_CEO");
		System.out.println(c3.check_dupobj(c1));
		System.out.println(c3.check_dupobj(c2));
	}	
}