import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int hight;
    System.out.println("Enter the no. of Rows : ");
    hight = sc.nextInt();
        int rowLen = (hight-1)*2;
        for(int i=0; i<hight; i++){
            int start = i;
            int end = rowLen-i;
            for(int j=0;j<=rowLen; j++){
                if(j==end){
                    System.out.println(i);
                    break;
                }
                else if(j==start){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
}
