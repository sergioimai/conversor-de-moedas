package ConverterMoedas;

import javax.swing.*;

public class ConverteMoedasParaReais {
	
	public void converterDolaresParaReais(double valorRecebido){
        double moedaDolar = valorRecebido * 5.30;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Reais");
    }

    public void converterEurosParaReais(double valorRecebido){
        double moedaEuro = valorRecebido * 5.17;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Reais");
    }

    public void converterLibrasParaReais(double valorRecebido){
        double moedaLibraEsterlina = valorRecebido * 5.96;
        moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibraEsterlina + " Reais");
    }
    public void converterPesosArgentinosParaReais(double valorRecebido){
        double moedaPesoArgentino = valorRecebido * 0.036;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoArgentino + " Reais");
    }

    public void converterPesosChilenosParaReais(double valorRecebido){
        double moedaPesoChileno = valorRecebido * 0.0057;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoChileno + " Reais");
    }

}
