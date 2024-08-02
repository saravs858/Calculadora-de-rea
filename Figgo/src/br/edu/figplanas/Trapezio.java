package br.edu.figplanas;

public class Trapezio {

	public double basemaior;
	public double basemenor;
	public double altura;
	public double area;
	
	
	public void calcArea() {
		area = altura*(basemaior + basemenor) / 2;
		System.out.println(area);
		
	}
}
