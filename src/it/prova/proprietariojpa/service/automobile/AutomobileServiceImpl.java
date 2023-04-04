package it.prova.proprietariojpa.service.automobile;

import java.util.List;

import it.prova.proprietariojpa.dao.automobile.AutomobileDAO;
import it.prova.proprietariojpa.model.Automobile;
import it.prova.proprietariojpa.service.automobile.AutomobileService;

public class AutomobileServiceImpl implements AutomobileService {
	private AutomobileDAO automobileDAO;

	public void setAutomobileDAO(AutomobileDAO automobileDAO) {
		this.automobileDAO = automobileDAO;
	}

	@Override
	public List<Automobile> listAllAutomobile() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aggiorna(Automobile automobileInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserisciNuovo(Automobile automobileInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rimuovi(Long idAutomobileInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	


}

