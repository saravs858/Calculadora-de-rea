package br.edu.figplanas;

public class Losango {

	public double diagonalmaior;
	public double diagonalmenor;
	public double area;
	
	public void calcArea() {
		area = (diagonalmaior * diagonalmenor) / 2;
		System.out.println(area);
		
	}

}
