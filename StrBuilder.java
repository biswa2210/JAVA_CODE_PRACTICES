import java.util.*;
public class StrBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);
        System.out.print(str1.append(str2));
    }
}
