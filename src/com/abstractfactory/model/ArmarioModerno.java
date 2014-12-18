package com.abstractfactory.model;

public class ArmarioModerno extends Armario {

	public ArmarioModerno() {
		setTipo("Moderno");
		setModelo("Duas portas");
		System.out.println("Armario tipo: Moderno - Modelo: Duas portas");
	}
}