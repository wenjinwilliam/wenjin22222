import org.junit.Test;

public class Fangdai extends calculator {
	// [�����������ʡ���1+�����ʣ�^��������]��[��1+�����ʣ�^����������1]
	@Override
	protected double equation(CalculatorBean bean) {
		// double chushu =
		// entity.getTotal()*entity.getMonthly_rate()*Math.pow(1+entity.getMonthly_rate(),entity.getMonthes());
		// double beichu = Math.pow(1+entity.getMonthly_rate(),
		// entity.getMonthes())-1;

		double a = bean.getBenjin() * bean.getLilv()
				* Math.pow(1 + bean.getLilv(), bean.getMonth());
		double b = Math.pow(1 + bean.getLilv(), bean.getMonth()) - 1;
		return a / b;
	}

	@Test
	public void test() {
		Fangdai fangdai = new Fangdai();
		CalculatorBean bean = new CalculatorBean(150000, 0.00575f, 60);
		fangdai.bean = bean;
		fangdai.output();

	}

}
