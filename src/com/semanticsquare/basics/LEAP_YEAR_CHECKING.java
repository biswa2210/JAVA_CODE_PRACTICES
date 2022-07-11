//LEAP YEAR CHECKING
import java.util.Scanner;
class leap_yr_check{
	boolean isleap(int yr){
	
		    // Return true if year is a multiple 
    // of 4 and not multiple of 100. 
    // OR year is multiple of 400. 
    return (((yr % 4 == 0) && (yr % 100 != 0)) || (yr % 400 == 0)); 
	}	
}
class LEAP_YEAR_CHECKING{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE YEAR : ");
	int yr=s.nextInt();
	leap_yr_check lpyr=new leap_yr_check();
	if(lpyr.isleap(yr))
	{
	System.out.println("IT IS  LEAP YEAR");
	}
	else{
	System.out.println("IT IS NOT LEAP YEAR");
	}
}}