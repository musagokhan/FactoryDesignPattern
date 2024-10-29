package factoryMethodDP.worker;

public class Manager extends Employee {
	
	private String name;
	private Integer subEmployeeNumber;
	
	public Manager(String name, Integer subEmployeeNumber) {
		super(name);
		this.name = name;
		this.subEmployeeNumber = subEmployeeNumber;
	}	
	
	public String getName() {
		return this.name;
	}

	public Integer getSubEmployeeNumber() {
		return subEmployeeNumber;
	}

	@Override
	public String toString() {
		return "\n Manager  [name=" + this.name + ", subEmployeeNumber=" + subEmployeeNumber + "]";
	}	

}
