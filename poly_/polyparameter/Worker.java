package poly_.polyparameter;

public class Worker extends Employee {
	public Worker(String name, double salary) {
		super(name, salary);
	}
	public void work() {
		System.out.println("普通员工： " + getName() + " 正在工作");
	}
	@Override
	public double getAnnual() {
		// TODO Auto-generated method stub
		return super.getAnnual();
	}

}
