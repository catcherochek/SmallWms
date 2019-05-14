package application.services;

public interface IService {

	/** registerService in Container
	 * @param name - unique servis name
	 * @param srv - serviceobject
	 * @return true - registration success. false - registration failed
	 */
	public boolean registerService(String name, Service srv);
	
	
	/** deletes Service from container
	 * @param name
	 * @return true if unregistering went good
	 * 			false if service with name doesn't exists
	 */
	public boolean unregisterService(String name);
	
	/** get service instance
	 * @param name
	 * @return serviceinstance, or null if not exists
	 */
	public Service getService(String name);
	
}
