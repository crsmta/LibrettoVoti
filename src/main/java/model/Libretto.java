package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author matia
 *classe che contiene gli oggetti di classe voto
 */
public class Libretto {
	private List<Voto> voti ;
	//costruttore semplice
	public Libretto() {
		this.voti=new ArrayList<>();
	}
	//DELEGA metodo add
	public void add(Voto voto) throws Exception {
		if (votoEsistente(voto)==-1)
		voti.add(voto);
	}
	//overloaded method punto 1
	public void addAll(List<Voto> voti) {
		this.voti.addAll(voti);	
	}
	//punto 2 

	/**
	 * metodo che ricerca tutti gli esami 
	 * per cui è stato ottenuto il valoreVoto
	 * @param valoreVoto
	 * @return List<Voto> (esami)
	 */
	public List<Voto> cercaMaterieDatoVoto(int valoreVoto){
		List<Voto> votiTrovati=new ArrayList<>(); 
		for (Voto voto : voti) {
			if (voto.getVoto()==valoreVoto)
				votiTrovati.add(voto);
		}
		return votiTrovati;
	}
	//punto 3
	
	/**
	 * metodo che restituisce il voto dell'esame passato come parametro
	 * @param nomeMateria
	 * @return int voto
	 */
	public int cercaVotoDataMateria(String nomeMateria){
		int votoOttenuto=0;
		for (Voto voto : voti) {
			if (voto.getMateria()==nomeMateria)
				votoOttenuto=voto.getVoto();
		}
		return votoOttenuto;
	}
	//punto 4
	
	/**
	 * metodo che restituisce 0  se l'esame è stato sostenuto
	 * 1 se l'esame è stato sostenuto con un voto diverso 
	 * -1 se non è stato sostenuto
	 * @param voto
	 * @return Boolean
	 */
	public int votoEsistente(Voto voto) throws Exception{
		for (Voto votoIterator : voti) {
			int compare=0;
			try {
				compare=votoIterator.compareToMy(voto);
				if (compare==0)
					return 0;
			}catch (NomeConflittoException nc){
				return 1;
			}
			
		}
		return -1;
	
	}
	@Override
	public String toString() {
		return "Libretto [voti=" + voti + "]";
	}


}
