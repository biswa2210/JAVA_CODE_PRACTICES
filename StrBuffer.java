import java.util.*;
public class StrBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        StringBuffer str1 = new StringBuffer(s1);
        StringBuffer str2 = new StringBuffer(s2);
        System.out.print(str1.append(str2));
        System.out.print(str1.length());
    }
}
