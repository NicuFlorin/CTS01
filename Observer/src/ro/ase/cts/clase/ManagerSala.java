package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala implements Subject{
	
	private List<Observer> clienti;
	private String numeSala;
	

	public ManagerSala(String numeSala) {
		super();
		this.clienti = new ArrayList<>();
		this.numeSala = numeSala;
	}

	@Override
	public void adaugareAbonat(Observer observer) {
		clienti.add(observer);
		
	}

	@Override
	public void stergereAbonat(Observer observer) {
		clienti.remove(observer);
		
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		clienti.forEach(item->item.receptionareMesaj(mesaj));
		
	}
	
	public void trimiteAnunt(String tipMeci) {
		trimiteMesaj("Astazi se va juca un meci de "+tipMeci);
	}
	

}
