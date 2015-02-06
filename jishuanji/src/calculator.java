import javax.swing.text.AbstractDocument;

public abstract class calculator {
	protected CalculatorBean bean;

	protected calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public calculator(CalculatorBean bean) {
		super();
		this.bean = bean;
	}

	public void output() {
		System.out.println("½á¹û" + equation(bean));

	}

	protected abstract double equation(CalculatorBean bean);

}
