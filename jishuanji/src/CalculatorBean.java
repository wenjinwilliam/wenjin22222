public class CalculatorBean {
	private int Benjin;
	private float Lilv;
	private int Month;

	public CalculatorBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CalculatorBean(int benjin, float lilv, int month) {
		super();
		Benjin = benjin;
		Lilv = lilv;
		Month = month;
	}

	public int getBenjin() {
		return Benjin;
	}

	public void setBenjin(int benjin) {
		Benjin = benjin;
	}

	public float getLilv() {
		return Lilv;
	}

	public void setLilv(float lilv) {
		Lilv = lilv;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

}
