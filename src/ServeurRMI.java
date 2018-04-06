import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmi.BanqueRmiService;

public class ServeurRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocateRegistry.createRegistry(1099); 
			BanqueRmiService od = new BanqueRmiService();
			System.out.println(od.toString());
			try {
				Naming.rebind("rmi://localhost:1099/BK", od);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
