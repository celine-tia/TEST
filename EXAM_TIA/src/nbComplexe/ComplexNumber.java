package nbComplexe;

public class ComplexNumber {
	private final int a;
	private final int b;
	private final static ComplexNumber ZERO = ComplexNumber(0, 0);
	private final static ComplexNumber REAL_ONE = ComplexNumber(1, 0);
	private final static ComplexNumber IMAGINARY_ONE = ComplexNumber(0, 1);

	public ComplexNumber(int a, int b) {

		this.a = a;
		this.b = b;
	}

	public ComplexNumber(int a) {

		this.a = a;
		this.b = 0;
	}

	public int getRealPart() {
		return a;
	}

	public int getImaginaryPart() {
		return b;
	}

	public boolean isPureReal() {
		if (b == 0) {
			return true;
		}
		return false;

	}

	public boolean isPureImaginary() {
		if (a == 0) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		if (this.isPureImaginary()) {
			return "|" + b;
		}
		if (this.isPureReal()) {
			return a + "|";
		}
		if (a == 0 && b == 0 ) {
			return a + "|" + b;
		}
	}
	
	
	
}
