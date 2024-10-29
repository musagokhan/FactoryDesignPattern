package factoryMethodDP.mainOp;

import factoryMethodDP.hr.WorkerDetail;

public class MainOperation {

	public static void main(String[] args) {
		
		WorkerDetail workerDetail = new WorkerDetail();
		workerDetail.manuelCreateWorkers(); // manuel olusturuldu.
		workerDetail.workerListInfo();      // bilgi alındı.

	}

}
