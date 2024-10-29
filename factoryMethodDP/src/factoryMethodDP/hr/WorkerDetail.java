package factoryMethodDP.hr;

import java.util.ArrayList;
import java.util.List;

import factoryMethodDP.factory.DirectorFactory;
import factoryMethodDP.factory.EmployeeFactory;
import factoryMethodDP.factory.ManagerFactory;
import factoryMethodDP.worker.Employee;

public class WorkerDetail {
	
	private List<Employee> workers = new ArrayList<Employee>();
	
	
	public void manuelCreateWorkers() {
		
		EmployeeFactory employeeFactory = new EmployeeFactory();
		ManagerFactory managerFactory = new ManagerFactory();
		DirectorFactory directorFactory = new DirectorFactory();
		
		
		Employee workerEmployee0 = employeeFactory.create("ismet");
		Employee workerEmployee1 = employeeFactory.create("ismail");
		
		Employee workerManager0 = managerFactory.create("mahmut",7);
		Employee workerManager1 = managerFactory.create("mehmet",8);
		
		Employee workerDirector0 = directorFactory.create("dilek", 7 , 2);
		Employee workerDirector1 = directorFactory.create("derya", 18 , 3);
			
		this.workers.add(workerEmployee0);
		this.workers.add(workerEmployee1);
		this.workers.add(workerManager0);
		this.workers.add(workerManager1);
		this.workers.add(workerDirector0);
		this.workers.add(workerDirector1);

	}


	public List<Employee> getWorkers() {
		return this.workers;
	}
	
	public void workerListInfo() {
		System.out.println(this.workers.toString());
	}


//	@Override
//	public String toString() {
//		return "WorkerDetail [workers=" + workers + "]";
//	}

	

}
