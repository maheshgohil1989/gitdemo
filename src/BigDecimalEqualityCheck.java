import java.math.BigDecimal;

public class BigDecimalEqualityCheck {

	public static void main(String[] args) {
		BigDecimal original = new BigDecimal(10.00);
		BigDecimal modified = new BigDecimal(10);

		if (original.equals(modified)) {
			System.out.println("equals");
		} else {
			System.out.println(" not equals");
		}
	}
}
