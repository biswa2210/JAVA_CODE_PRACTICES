import java.util.Scanner;
public class JavaArray {
    public static void main(String[] args){
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        int a;
        for(int i=0;i<numbers.length;i++){
            a=sc.nextInt();
            numbers[i]=a;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
}
