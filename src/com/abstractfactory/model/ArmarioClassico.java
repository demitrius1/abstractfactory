package com.abstractfactory.model;

public class ArmarioClassico extends Armario {

	public ArmarioClassico() {
		setTipo("Clássico");
		setModelo("Três portas");
		System.out.println("Armario tipo: Classico - Modelo: Tres portas");
	}
}