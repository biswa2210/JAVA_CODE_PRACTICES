public class clark{
	private int id;
	String name,design;
	clark(int id,String name,String design)
	{
		this(name,design);
		this.id=id;
	}
	clark(String name,String design)
	{
		this(design);
		this.name=name;		
	}
	clark(String design)
	{
		this.design=design;
	}
	public boolean check_dupobj(clark c){
		return id==c.id;
	}
}