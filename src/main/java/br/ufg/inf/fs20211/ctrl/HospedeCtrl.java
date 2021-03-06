package br.ufg.inf.fs20211.ctrl;

import java.util.List;

import br.ufg.inf.fs20211.business.HospedeBusiness;
import br.ufg.inf.fs20211.entities.Hospede;
import br.ufg.inf.fs20211.exceptions.HospedeException;


public class HospedeCtrl {
	
	HospedeBusiness business = new HospedeBusiness();
	
	public List<Hospede> findAll(){
		return business.findAll();
	}
	
	public Hospede findById(Integer id){
		return business.findById(id);
	}
	
	public Hospede insert(Hospede hospede) {
		
		try {
			hospede = business.insert(hospede);
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
		
		return hospede;
	}
	public Hospede update(Hospede hospede) {
		
		try {
			hospede = business.update(hospede);
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
		
		return hospede;
	}
	
public void delete(Integer id) {
		
		try {
			business.delete(id);
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
		
	}

}