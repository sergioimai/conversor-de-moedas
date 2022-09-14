package ConverterMoedas;

import javax.swing.*;

public class ConverteDistancia {

	public double converterMetrosParaQuilometros (double valorRecebido) {
		double metrosParaQuilometros = valorRecebido / 1000;
		JOptionPane.showInternalMessageDialog(null, valorRecebido + " Metros são " + metrosParaQuilometros + " Km");
		return metrosParaQuilometros;
	}
	
	public double converterMetrosParaCentimetros (double valorRecebido) {
		double metrosParaCentimetros = valorRecebido * 100;
		metrosParaCentimetros = (double) Math.round(metrosParaCentimetros * 100d)/ 100;
		JOptionPane.showInternalMessageDialog(null, valorRecebido + " Metros são " + metrosParaCentimetros + " Cm");
		return metrosParaCentimetros;
	}
	
	public double converterMetrosParaMilimetros (double valorRecebido) {
		double metrosParaMilimetros = valorRecebido * 1000;
		metrosParaMilimetros = (double) Math.round(metrosParaMilimetros * 100d)/ 100;
		JOptionPane.showInternalMessageDialog(null, valorRecebido + " Metros são " + metrosParaMilimetros + " Mm");
		return metrosParaMilimetros;
	}
}
