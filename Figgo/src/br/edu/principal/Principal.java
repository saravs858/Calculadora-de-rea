package br.edu.principal;
import br.edu.figplanas.*;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		t1.altura = 4;
		t1.base = 400;
		t1.calcArea();
		
		Quadrado q1 = new Quadrado();
		q1.lado = 45;
		q1.calcArea();
		
		Retangulo r1 = new Retangulo();
		r1.altura = 2;
		r1.base = 8;
		r1.calcArea();
		
		Losango l1 = new Losango();
		l1.diagonalmaior= 3;
		l1.diagonalmenor = 76;
		l1.calcArea();
		
		Paralelogramo p1 = new Paralelogramo();
		p1.altura = 56;
		p1.base = 7;
		p1.calcArea();
		
		Circulo c1 = new Circulo();
		c1.raio = 5;
		c1.calcArea();
		
		Trapezio tr1 = new Trapezio();
		tr1.basemaior = 4;
		tr1.basemenor = 5;
		tr1.altura = 6;
		tr1.calcArea();
		

	}
	

}
