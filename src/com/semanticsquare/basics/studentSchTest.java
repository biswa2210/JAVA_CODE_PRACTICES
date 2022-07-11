class studentSchTest{
	public static void main(String[] args){
		int[] studIds=new int[]{1001,1002,1003};
		schoolStudent student1=new schoolStudent(studIds[0],"BISWA","Male"); 
		schoolStudent student2=new schoolStudent(studIds[1],"ANKITA","FEMALE");
		schoolStudent student3=new schoolStudent(studIds[2],"SOUMILI","FEMALE");
		System.out.println("Student 1 Name : "+student1.getName());
		System.out.println("Student 2 Name : "+student2.getName());
		System.out.println("Student 3 Name : "+student3.getName());
		System.out.println("Student 1 Id   : "+student1.getId());
		System.out.println("Student 2 Id   : "+student2.getId());
		System.out.println("Student 3 Id   : "+student3.getId());
		System.out.println("Update Student1 Name:");
		student1.setName("Biswa");
		System.out.println("Student 1 Name : "+student1.getName());
		}
}