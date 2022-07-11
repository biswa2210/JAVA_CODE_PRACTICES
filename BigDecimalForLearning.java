import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalForLearning {
    public static void main(String[] args){
        BigDecimal bd1 = new BigDecimal("0.2");
        BigDecimal bd2 = new BigDecimal("0.5");
        BigDecimal bd3 =new BigDecimal("0.8");
        System.out.print((bd1.add(bd2)).add(bd3));
    }
}
