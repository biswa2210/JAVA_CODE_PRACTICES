public class schoolStudent{
	private String name;
	private String gender;
	private int id;
	schoolStudent(int id,String name,String gender){
		this(name,gender);
		this.id=id;
	}
	schoolStudent(String name,String gender){
        this.gender=gender;
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
}