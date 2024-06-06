package joptionpane_revisao;

import javax.swing.*;
import java.awt.*;

public class JOPRevisao4 {

    /*
    Faça um programa que leia o número e o peso de um boi, a leitura encerra quando o número digitado for 0 (zero) e informe:
	Quantos bois foram digitados;
	Qual o total de peso dos bois;
	Qual a média de peso dos bois;
	Qual o número e o peso do boi mais pesado;
	Qual o número e o peso do boi mais leve.
     */
    public static void main(String[] args) {
        //variaveis
        int numBoiPesado = 0, numBoiLeve = 0, totalBoi = 0;
        float pesoBoi = 0, pesoTotal = 0, mediaPeso = 0;
        float boiPesado = Float.MIN_VALUE, boiLeve = Float.MAX_VALUE; 
        int numeroBoi;

        do {
            //entrada e conversao de dados
            String numero = JOptionPane.showInputDialog(null, "Digite o numero do boi ou '0' (zero) para sair ", "Balança de boi",
                    JOptionPane.INFORMATION_MESSAGE);
            numeroBoi = Integer.parseInt(numero);

            if (numeroBoi != 0) {
                String peso = JOptionPane.showInputDialog(null,"Agora, o seu peso (em arrobas): ", "Balança de boi",
                        JOptionPane.INFORMATION_MESSAGE);
                pesoBoi = Float.parseFloat(peso);
                
                //para cada boi registrado, o peso total aumenta
                pesoTotal += pesoBoi;

                //para cada boi registrado, a qntd aumenta
                totalBoi += 1;

                //qual é o mais pesado
                if (pesoBoi > boiPesado) {
                    boiPesado = pesoBoi;
                    numBoiPesado = numeroBoi;
                }

                //qual é o mais leve
                if (pesoBoi < boiLeve) {
                    boiLeve = pesoBoi;
                    numBoiLeve = numeroBoi;
                }
            }
        } while (numeroBoi != 0);
        
        //média do peso dos bois
        mediaPeso = pesoTotal / totalBoi;
        
        //saida de resultados
        String resultado = "Quantidade de bois digitados: " + totalBoi + ", somando: " + pesoTotal + " arrobas.\n" +
                "A média do peso dos bois foi de " + mediaPeso + " arrobas.\n" +
                "O boi mais pesado foi o  " + numBoiPesado + " com "+ boiPesado + " arrobas.\n" +
                "O boi mais leve foi o  " + numBoiLeve + " com "+ boiLeve + " arrobas.\n";
        
        JOptionPane.showMessageDialog(null, resultado);
    }
