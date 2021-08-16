package br.ufg.inf.fs20211.config;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.ufg.inf.fs.enums.CategoriaQuarto;
import br.ufg.inf.fs20211.ctrl.HospedagemCtrl;
import br.ufg.inf.fs20211.ctrl.HospedeCtrl;
import br.ufg.inf.fs20211.ctrl.HotelCtrl;
import br.ufg.inf.fs20211.ctrl.QuartoCtrl;
import br.ufg.inf.fs20211.entities.Hospedagem;
import br.ufg.inf.fs20211.entities.Hospede;
import br.ufg.inf.fs20211.entities.Hotel;
import br.ufg.inf.fs20211.entities.Quarto;

public class App {

	public static void main(String[] args) {
		System.out.println("Funciona");

		testeJpaHospede();

	} 
	
public static void testeJpaHospedagem() {
	HospedagemCtrl hctrl = new HospedagemCtrl(); 
	Date checkin = new Date(2021,20,8);
	Date checkout = new Date(2021,25,8);
	
	Hospedagem hg1 = new Hospedagem(1,1,1,checkin,checkout);
	Hospedagem hg2 = new Hospedagem(1,1,1,checkin,checkout);
	Hospedagem hg3 = new Hospedagem(1,1,1,checkin,checkout);
	Hospedagem hg4 = new Hospedagem(1,1,1,checkin,checkout); 
	
	hg1 = hctrl.insert(hg1);
	System.out.println(hg1);
	
	hg2 = hctrl.insert(hg2);
	System.out.println(hg2);
	
	hg3 = hctrl.insert(hg3);
	System.out.println(hg3);
	
	hg4 = hctrl.insert(hg4);
	System.out.println(hg4); 
	
	for(Hospedagem h: hctrl.findAll()) {
		System.out.println(h);
	}
	
	System.out.println("UPDATE");
	Hospedagem hospedagem2 = hctrl.findById(2);
	hospedagem2.setId_quarto(6);
	hospedagem2 = hctrl.update(hospedagem2);

	System.out.println("Lista de Hospedagens Cadastradas");
	for (Hospedagem h : hctrl.findAll()) {
		System.out.println(h);
	}

	System.out.println("Deletar hospedagem 1");
	hctrl.delete(1);

	System.out.println("Lista de Hospedagens Cadastradas");
	for (Hospedagem h : hctrl.findAll()) {
		System.out.println(h);
	}
	
}
	
public static void testeJpaHospede() {
		
		HospedeCtrl hospedectrl = new HospedeCtrl();
		
		System.out.println("Lista Hospedes Previa");
		for (Hospede h : hospedectrl.findAll()) {
			System.out.println(h);
		}

		System.out.println("Buscar pelo #ID 2");
		Hospede hospede = hospedectrl.findById(2);
		System.err.println(hospede);
		
		Date data = new Date(1980,4,16);
		
		
		Hospede h1 = new Hospede(null, "Joao",data,2135648);
		Hospede h2 = new Hospede(null, "Maria",data,2125648);
		Hospede h3 = new Hospede(null, "Duda",data,2145648);
		Hospede h4 = new Hospede(null, "Dudu",data,2155648); 
		
		h1 = hospedectrl.insert(h1);
		System.out.println(h1);
		h2 = hospedectrl.insert(h2);
		System.out.println(h2);
		h3 = hospedectrl.insert(h3);
		System.out.println(h3);
		h4 = hospedectrl.insert(h4);
		System.out.println(h4);
		
		for(Hospede h: hospedectrl.findAll()) {
			System.out.println(h);
		} 
		
		System.out.println("UPDATE");
		System.out.println("#ID original: " + h2.getId_hospede());
		h2.setNm_hospede(h2.getNm_hospede() + " ALTERADO");
		h2 = hospedectrl.update(h2);
		System.out.println("#ID alterado: " + h2);

		System.out.println("Lista Final de Hospedes Cadastrados");
		for (Hospede h : hospedectrl.findAll()) {
			System.out.println(h);
		}

		System.out.println("Deletar #ID 1");
		hospedectrl.delete(1);

		System.out.println("Lista de Hospedes Atualizada");
		for (Hospede h : hospedectrl.findAll()) {
			System.out.println(h);
		}
		
	}
	
	public static void testeJpaQuarto() {
		QuartoCtrl ctrl = new QuartoCtrl ();
		HotelCtrl hotelCtrl = new HotelCtrl();
		System.out.println("Busca Todos");
		for(Quarto h : ctrl.findAll()) {
			System.out.println(h);
		}
		
		System.out.println("Buscar por ID");
		System.out.println(ctrl.findById(3));
		
		System.out.println("Inserir no banco");
		Quarto q1 = new Quarto(null, hotelCtrl.findById(1), CategoriaQuarto.APARTAMENTO, 3, 1010, 150.0);
		Quarto q2 = new Quarto(null, hotelCtrl.findById(2), CategoriaQuarto.DORMITORIO, 8, 310, 50.0);
		Quarto q3 = new Quarto(null, hotelCtrl.findById(3), CategoriaQuarto.LUXO, 5, 1210, 550.0);
		Quarto q4 = new Quarto(null, hotelCtrl.findById(4), CategoriaQuarto.SIMPLES, 2, 110, 100.0);
		q1 = ctrl.insert(q1);
		System.out.println(q1);
		
		q2 = ctrl.insert(q2);
		System.out.println(q2);
		
		q3 = ctrl.insert(q3);
		System.out.println(q3);
		
		q4 = ctrl.insert(q4);
		System.out.println(q4);
		
		for(Quarto q : ctrl.findAll()) {
			System.out.println(q);
		}
		
		System.out.println("Alterar no banco");
		q1.setPrDiaria(175.0);
		q1 = ctrl.update(q1);

		for(Quarto q : ctrl.findAll()) {
			System.out.println(q);
		}

		
		
		System.out.println("Excluir");
		ctrl.delete(q3.getIdQuarto());
		System.out.println("Terminou");
	}
	
	public static void testeJpaHotel() {
		HotelCtrl ctrl = new HotelCtrl();
		System.out.println("Busca Todos");
		for(Hotel h : ctrl.findAll()) {
			System.out.println(h);
		}
		
		System.out.println("Buscar por ID");
		System.out.println(ctrl.findById(3));
		
		System.out.println("Inserir no banco");
		Hotel hotel = new Hotel(null, "Teste", "Qualquer Lugar", 10);
		hotel = ctrl.insert(hotel);
		System.out.println(hotel);
		
		System.out.println("Alterar no banco");
		hotel.setNmHotel("Teste Alterado");
		hotel = ctrl.update(hotel);
		System.out.println(hotel);
		
		
		System.out.println("Excluir");
		ctrl.delete(hotel.getIdHotel());
		System.out.println("Terminou");
	}

	public static void testeJpa() {
		EntityManager em = DaoFactory.getEntityManager();
		
		System.out.println("Update do Objeto");
		Hotel hotelUpdate = em.find(Hotel.class, 2);
		
		hotelUpdate.setNmHotel("Ibis Hotel");
		
		em.getTransaction().begin();
		em.persist(hotelUpdate);
		em.getTransaction().commit();
		
		
		
		System.out.println("Delete do Objeto");
		
		DaoFactory.closeConnection();
	}

}
