/**
 * @author matia
 * classe che contiene i voti per ciascuna materia 
 * e la data di conseguimento dell'esame
 */
package model;

import java.time.LocalDate;
public class Voto implements Comparable<Voto>{
private String materia;
private int  voto;
private LocalDate data;
public Voto() {
	super();
}
public Voto(String materia, int voto,LocalDate data) {
	this.materia=materia;
	this.voto=voto;
	this.setData(data);
}

//TODO check get set
public String getMateria() {
	return materia;
}
public void setMateria(String materia) {
	this.materia = materia;
}
public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public LocalDate getData() {
	return data;
}
public void setData(LocalDate data) {
	this.data = data;
}
public Voto duplicate(Voto voto) {
	Voto duplicato= new Voto(voto.getMateria(),voto.getVoto(),voto.getData());
	return duplicato;
}
public int compareToMy(Voto other) throws Exception {
	if(this.materia==other.materia)
		throw new NomeConflittoException();
	return this.toString().compareTo(other.toString());
	
}
@Override
public String toString() {
	return "Voto [materia=" + materia + ", voto=" + voto + ", data=" + data + "]";
}
@Override
public int compareTo(Voto o) {
	// TODO Auto-generated method stub
	return 0;
}

}
