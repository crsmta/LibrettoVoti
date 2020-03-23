package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestLibretto {

Libretto lib ;
	
	private void run(){
		lib=new Libretto();
		Voto v1=new Voto("Economia",28,LocalDate.of(2020, 06, 28));
		Voto v2=new Voto("Statistica",18,LocalDate.of(2020, 04, 28));
		Voto v3=new Voto("Analisi II",25,LocalDate.of(2020, 03, 28));
		Voto v4=new Voto("Geometria II",28,LocalDate.of(2020, 01, 28));
		Voto v5=new Voto("Economia II",28,LocalDate.of(2020, 06, 28));
		Voto v6=new Voto("Statistica II",119,LocalDate.of(2020, 04, 28));
		Voto v7=new Voto("Analisi I",25,LocalDate.of(2020, 03, 28));
		Voto v8=new Voto("Inglese",28,LocalDate.of(2020, 01, 28));
		lib.add(v1);
		lib.add(v2);
		lib.add(v3);
		lib.add(v4);
		lib.add(v5);
		lib.add(v6);
		lib.add(v7);
		lib.add(v8);
		System.out.println(lib.toString()+"\n");
		
	}
	public static void main(String[] args) {
		TestLibretto test = new TestLibretto() ;
		test.run();
	}
}
