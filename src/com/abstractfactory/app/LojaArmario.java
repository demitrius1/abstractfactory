package com.abstractfactory.app;

import com.abstractfactory.model.FabricaArmario;

public class LojaArmario {

	public static void main(String[] args) {
		FabricaArmario fabricaArmario = new FabricaArmario();
		String tipo = "Moderno";
		String modelo = "Duas portas";
		fabricaArmario.getArmario(tipo, modelo);
	}
}