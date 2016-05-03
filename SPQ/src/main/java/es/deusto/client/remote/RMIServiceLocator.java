package es.deusto.client.remote;

import es.deusto.server.IServer;
import es.deusto.server.Server;

public class RMIServiceLocator {

	private IServer server; 

	public RMIServiceLocator(String IP, String port, String name){
		this.setManager(IP,port,name);
	}

	private void setManager(String IP, String port, String name) {

		String serverName="//"+ IP +":"+ port +"/"+ name ;
		try{
			this.server = (IServer) java.rmi.Naming.lookup(serverName);
		}catch(Exception e) {
			System.err.println("- Exception running the client: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public IServer getService(){
		return server;
	}
}
