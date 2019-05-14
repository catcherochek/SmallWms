package application.services;

import java.util.ArrayList;
import java.util.HashMap;

public class serviceProvider implements IService{
	private HashMap<String,Service> srvList;
	private static serviceProvider that;
	private serviceProvider() {
		srvList = new HashMap<String,Service>();
	}
	public static serviceProvider getInstance() {
		if (that == null) {that = new serviceProvider();}
		return that;
	}
	@Override
	public boolean registerService(String name, Service srv) {
		// TODO Auto-generated method stub
		if (srvList.containsKey(name) == false) {
			srvList.put(name, srv);
			return true;
		}
		return false;
	}
	@Override
	public boolean unregisterService(String name) {
		if (srvList.containsKey(name) != false) {
			srvList.remove(name);
			return true;
			
		}
		return false;
	}
	@Override
	public Service getService(String name) {
		return (srvList.containsKey(name))?srvList.get(name):null;
		
	}
	
	
	
	
}