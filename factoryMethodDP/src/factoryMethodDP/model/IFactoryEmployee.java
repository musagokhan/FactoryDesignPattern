package factoryMethodDP.model;

import factoryMethodDP.worker.Employee;

/*  NOTE: Tek IFACTORY ile  3 farklı yapıyı oluşturamadık.
    Employee sadece isimle ihtiyaç duyuyor. Manager ise bağlı çalılana da ihtiyaç duyuyor.
    Bunun  için Interface'leri çoğulluyoruz.
 */
public interface IFactoryEmployee {
	
	public Employee create(String name);

}
