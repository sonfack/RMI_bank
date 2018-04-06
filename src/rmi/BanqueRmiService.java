package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote {

	public BanqueRmiService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return mt*650;
	}

	@Override
	public Compte consulterCompte(int code) throws RemoteException {
		// TODO Auto-generated method stub
		Compte cp = new Compte(code, Math.random()*1000, new Date()); 
		return cp;
	}

	@Override
	public List<Compte> listeCompte() throws RemoteException {
		// TODO Auto-generated method stub
		List<Compte> lcp = new ArrayList<>(); 
		Compte cp1 = new Compte(1, Math.random()*1000, new Date()); 
		Compte cp2 = new Compte(2, Math.random()*1000, new Date()); 
		lcp.add(cp1); 
		lcp.add(cp2); 
		return null;
	}

}
