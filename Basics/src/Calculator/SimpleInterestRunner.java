package Calculator;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator obj = new SimpleInterestCalculator("6700","4.32");
		System.out.println("Amount : "+obj.calculateInterest(3));
	}

}
