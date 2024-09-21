package Com.CoreX.Calculation;

/**
 * <h5>This Class contains basic arithmetic calculation</h5>
 * <br>
 * <h5>Note every methods in the library have input as string and output as string</h5><br>
 * <h5>So make sure the input and output has been correct in your class</h5>
 */
public class SimpleCalculation {
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @return Addition of two numbers
	 */
	public String Addition(String number1, String number2) {
		
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		int result=num1+num2;
		
		return String.valueOf(result);
		
	}

}
