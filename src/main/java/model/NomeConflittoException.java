package model;

public class NomeConflittoException extends Exception {
	public NomeConflittoException(){
		super("nome esame già registrato");
	}
}
