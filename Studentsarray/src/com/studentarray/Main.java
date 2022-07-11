package com.studentarray;
class Student{
    int roll_no;
    String name;
    int age;
}
public class Main {
    static void arrays()
    {
        int[] rollnos= new int[5];
        rollnos[0]=1;
        rollnos[1]=2;
        rollnos[2]=3;
        rollnos[3]=4;
        rollnos[4]=5;
        System.out.println("TOTAL NUMBER OF STUDENTS :: "+rollnos.length);
        int[] age = {18,19,5,6,1};
        Student[] students = new Student[5];
        //Object Creations
        students[0]=new Student();
        students[1]=new Student();
        students[2]=new Student();
        students[3]=new Student();
        students[4]=new Student();
        //roll numbers of students
        students[0].roll_no=rollnos[0];
        students[1].roll_no=rollnos[1];
        students[2].roll_no=rollnos[2];
        students[3].roll_no=rollnos[3];
        students[4].roll_no=rollnos[4];
        //names of students
        students[0].name="BISWA";
        students[1].name="ROMI";
        students[2].name="PUKU";
        students[3].name="PULI";
        students[4].name="CHIKU";
        students[0].name="BISWA";
        students[1].name="ROMI";
        students[2].name="PUKU";
        students[3].name="PULI";
        students[4].name="CHIKU";
        //ages of students
        students[0].age=age[0];
        students[1].age=age[1];
        students[2].age=age[2];
        students[3].age=age[3];
        students[4].age=age[4];
        for(int i=0;i<rollnos.length;i++)
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("ROLL NUMBER: "+students[i].roll_no);
            System.out.println("NAME: "+students[i].name);
            System.out.println("AGE: "+students[i].age);
            System.out.println("---------------------------------------------------------");
        }
    }
    public static void main(String[] args) {
	// write your code here
       arrays();
    }
}
