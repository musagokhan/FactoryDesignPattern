package factoryMethodDP.worker;

public class Director extends Employee {
	
	private String name;
	private Integer subEmployeeNumber;
	private Integer subManagerNumber;
	
	public Director(String name, Integer subEmployeeNumber, Integer subManagerNumber) {
		super(name);
		this.name = name;
		this.subEmployeeNumber = subEmployeeNumber;
		this.subManagerNumber = subManagerNumber;
	}

	public String getName() {
		return this.name;
	}

	public Integer getSubEmployeeNumber() {
		return subEmployeeNumber;
	}

	public Integer getSubManagerNumber() {
		return subManagerNumber;
	}

	@Override
	public String toString() {
		return "\n Director [name=" + name + ", subEmployeeNumber=" + subEmployeeNumber + ", subManagerNumber="
				+ subManagerNumber + "]";
	}
		
}
