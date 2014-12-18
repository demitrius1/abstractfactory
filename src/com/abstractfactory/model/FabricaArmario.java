package com.abstractfactory.model;

public class FabricaArmario {

	public Armario getArmario(String tipo, String modelo) {
		if (modelo.equals("Classico"))
			return new ArmarioClassico();
		else if (modelo.equals("Moderno"))
			return new ArmarioModerno();
		return null;
	}

}