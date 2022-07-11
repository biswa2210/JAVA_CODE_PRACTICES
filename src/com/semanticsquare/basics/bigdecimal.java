import java.math.BigDecimal;
public class bigdecimal{
	public static void main(String[] args)
	{
		BigDecimal first = new BigDecimal("0.3");
		BigDecimal second = new BigDecimal("0.2");
		System.out.println(first.add(second));
	}
}