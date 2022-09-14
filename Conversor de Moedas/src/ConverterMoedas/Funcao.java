package ConverterMoedas;

//import ConverterMoedas.funcaoConversao;
//import ConverterMoedas.ConverteMoedasParaReais;

import javax.swing.JOptionPane;


public class Funcao {
	
	funcaoConversao moedas = new funcaoConversao();
	ConverteMoedasParaReais reais = new ConverteMoedasParaReais();
	
	public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();
        
        switch (opcao) {
        case "De Reais a Dólares":
            moedas.ConverterReaisParaDolar(valorRecebido);
            break;
        case "De Reais a Euros":
            moedas.ConverterReaisParaEuro(valorRecebido);
            break;
        case "De Reais a Libras":
            moedas.ConverterReaisParaLibraEsterlina(valorRecebido);
            break;
        case "De Reais a Peso Argentino":
            moedas.ConverterReaisParaPesoArgentino(valorRecebido);
            break;
        case "De Reais a Peso Chileno":
            moedas.ConverterReaisParaPesoChileno(valorRecebido);
            break;
        case "De Dólares a Reais":
            reais.converterDolaresParaReais(valorRecebido);
            break;
        case "De Euros a Reais":
            reais.converterEurosParaReais(valorRecebido);
            break;
        case "De Libras a Reais":
            reais.converterLibrasParaReais(valorRecebido);
            break;
        case "De Peso Argentino a Reais":
            reais.converterPesosArgentinosParaReais(valorRecebido);
            break;
        case "De Peso Chileno a Reais":
            reais.converterPesosChilenosParaReais(valorRecebido);
            break;
        }
	}

}
