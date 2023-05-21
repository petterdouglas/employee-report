package entities;

public class Report {

	private int id;
	private String name;
	private double salary;

	public Report() {

	}

	public Report(int id) {
		this.id = id;
	}

	public Report(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		this.salary += salary * percentage / 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return getId() + ", " + getName() + ", " + String.format("%.2f%n", getSalary());
	}
}
