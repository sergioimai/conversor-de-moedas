package ConverterMoedas;

import javax.swing.*;

public class ConverterDistancias {
	
	ConverteDistancia distancia = new ConverteDistancia();
	
	public void converterDistancia (double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha uma opção:", "Distância", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
				"Metros a Quilômetros",
				"Metros a Centímetros",
				"Metros a Milímetros"},"Escolha")).toString();
		
		switch (opcao) {
			case "Metros a Quilômetros":
				distancia.converterMetrosParaQuilometros (valorRecebido);
				break;
			case "Metros a Centímetros":
				distancia.converterMetrosParaCentimetros (valorRecebido);
				break;
			case "Metros a Milímetros":
				distancia.converterMetrosParaMilimetros (valorRecebido);
				break;
			
		}
	}
}
