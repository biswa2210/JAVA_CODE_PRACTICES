package com.emptest;
class employee{
    int id;
    String name;
    String desi;
    void setempdetails(int empid,String n,String dsg)
    {
        id=empid;
        name=n;
        desi=dsg;
    }
    void display()
    {
        System.out.println("ID : "+id+", NAME : "+name+", DESIGNATION :"+desi);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        employee em1=new employee();
        employee em2=new employee();
        em1.setempdetails(1001,"BISWARUP","SOFTWARE ENGINEERING");
        em2.setempdetails(1002,"ANKITA","MECHANICAL ENGINEERING");
        em1.display();
        em2.display();
    }
}
