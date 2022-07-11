  class studentdetailsarray {  
      static void arrays() {
	      System.out.println("\nInside arrays ...");
		  int[] scores = new int[4];	

		  scores[0] = 90;
		  scores[1] = 70;
		  scores[2] = 80;
		  scores[3] = 100;
		  
		  /*int[] scores = new int[] {90, 70, 80, 100};*/
		  
		  //int[] scores = {90, 70, 80, 100};
		  
		  System.out.println("Mid-Term 1: " + scores[0]);
		  System.out.println("Mid-Term 2: " + scores[1]);
		  System.out.println("Final: " + scores[2]);
		  System.out.println("Project: " + scores[3]);
		  System.out.println("# exams: " + scores.length);
		  
		  Student[] students = new Student[3];//{new Student(), new Student(), new Student()};
		  students[0] = new Student();
		  students[1] = new Student();
		  students[2] = new Student();
		  students[0].name = "John";
		  students[1].name = "Raj";
		  students[2].name = "Anita";
		  System.out.println("Student 1: " + students[0].name);
		  System.out.println("Student 2: " + students[1].name);
		  System.out.println("Student 3: " + students[2].name);
	  }
	  
	  public static void main(String[] args) {	
	   	  // Language Basics 1
		  //print();	  
		  //primitives();
		  //typeCasting();	
          arrays();		  
	  }       
}