package factoryMethodDP.factory;

//import factoryMethodDP.model.IFactory; //Tek foactory yetmedi cogullandi ve yenisi ile olusturuldu
import factoryMethodDP.model.IFactoryDirector;
import factoryMethodDP.worker.Director;
import factoryMethodDP.worker.Employee;

public class DirectorFactory implements IFactoryDirector{

	@Override
	public Employee create(String name, Integer subEmployeeNumber, Integer subManagerNumber) {
		Director director = new Director(name, subEmployeeNumber, subManagerNumber);
		return director;
	}

}
