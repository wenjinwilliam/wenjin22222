import org.junit.Test;

public class Geren extends calculator {
	
//	public Geren(CalculatorBean bean) {
//		super(bean);
//	}

	@Override
	protected double equation(CalculatorBean bean) {
		double hou = bean.getBenjin() - 3500;
		if (hou < 1500) {
			return hou * 0.03;
		} else if (1500 <= hou && hou < 4500) {
			return hou * 0.1 - 105;
		} else if (4500 <= hou && hou < 9000) {
			return hou * 0.2 - 555;
		} else if (9000 <= hou && hou < 35000) {
			return hou * 0.25 - 1005;
		} else if (35000 <= hou && hou < 55000) {
			return hou * 0.30 - 2755;
		} else if (55000 <= hou && hou < 80000) {
			return hou * 0.35 - 5505;
		} else if (80000 >= hou) {
			return hou * 0.45 - 13505;
		}
		return 0;
	}

	@Test
	public void test() {
		Geren geren = new Geren();
		CalculatorBean bean = new CalculatorBean(80000, 0, 0);
		geren.bean = bean;
		geren.output();

	}

}
