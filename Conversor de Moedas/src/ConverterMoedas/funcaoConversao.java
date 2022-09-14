package ConverterMoedas;

import javax.swing.JOptionPane;

public class funcaoConversao {
	
		
	public void ConverterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.30;
		moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dolares");
	}
	
	public void ConverterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.17;
		moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
	}
	
	public void ConverterReaisParaLibraEsterlina(double valorRecebido) {
		double moedaLibraEsterlina = valorRecebido / 5.96;
		moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibraEsterlina + " Libra Esterlina.");
	}
	
	public void ConverterReaisParaPesoArgentino(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido / 0.036;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " Pesos Argentinos");
	}
	
	public void ConverterReaisParaPesoChileno(double valorRecebido) {
		double moedaPesoChileno = valorRecebido / 0.0057;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
	}


}
