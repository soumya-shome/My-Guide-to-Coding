package Calculator;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal rinterest;
	
	public SimpleInterestCalculator(String principal,String rinterest) {
		this.principal = new BigDecimal(principal);
		this.rinterest = new BigDecimal(rinterest);
	}

	public BigDecimal calculateInterest(int time) {
		return principal.add(principal.multiply(rinterest).multiply(new BigDecimal(time)));
	}
	
	
}
