package entities;

public class Employee {
	
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percent) {
		this.grossSalary += grossSalary * percent / 100.0;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}

}
