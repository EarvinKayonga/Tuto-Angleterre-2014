package part2;

public class Operation {

	private float val1, val2;
	private char operator;
	
	public Operation(float value1, char c, float value2) {
		if (c=='+' || c=='-' || c=='*' || c=='/') {
			val1=value1;
			operator=c;
			val2=value2;
		} else {
			val1=val2=0;
			operator='?';
		}
	}
	
	public Operation(float val) {
		this(val, '+', 0.0f);
	}
	
	public float eval() throws BadOperatorException {
		if (operator=='?')
			throw new BadOperatorException("'"+operator+"' is not a valid operator.");
		else {
			switch(operator) {
			case '+' :
				return val1+val2;
			case '-' :
				return val1-val2;
			case '*' :
				return val1*val2;
			case '/' :
				return val1/val2;
			default :
				throw new BadOperatorException("'"+operator+"' is not a valid operator.");
			}
		}
	}

}
