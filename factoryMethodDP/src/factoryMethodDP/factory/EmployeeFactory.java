package factoryMethodDP.factory;

//import factoryMethodDP.model.IFactory; //Tek foactory yetmedi cogullandi ve yenisi ile olusturuldu
import factoryMethodDP.model.IFactoryEmployee;
import factoryMethodDP.worker.Employee;

public class EmployeeFactory implements IFactoryEmployee {
	
	@Override
	public Employee create(String name) {
		Employee employee = new Employee(name);		
		return employee;
	}
}
