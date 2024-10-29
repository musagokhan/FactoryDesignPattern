package factoryMethodDP.factory;

//import factoryMethodDP.model.IFactory; //Tek foactory yetmedi cogullandi ve yenisi ile olusturuldu
import factoryMethodDP.model.IFactoryManager;
import factoryMethodDP.worker.Employee;
import factoryMethodDP.worker.Manager;

public class ManagerFactory implements IFactoryManager {
	
	@Override
	public Employee create(String name, Integer subEmployeeNumber) {
		Manager manager = new Manager(name, subEmployeeNumber);
		return manager;
	}
	
}
