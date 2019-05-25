package Calculo;

import java.util.Scanner;

public class CalculoLiq {
		
		public static void main(String[] args) {

		System.out.println("insira o salário \n");
			Scanner scanner = new Scanner(System.in);
			double valor = 0;
			valor = scanner.nextDouble();

			double inss1 = 1751.81;
			double inss2 = 2919.72;
			double inss3 = 5839.45;

			double inssfx1 = 0.08;
			double inssfx2 = 0.09;
			double inssfx3 = 0.11;
			double parcial = 0;
			double abatimento = 621.04;

			if (valor > inss3) {
				parcial = valor - abatimento;
			} else if (valor > inss2) {
				parcial = valor - (valor * inssfx3);
			} else if (valor > inss1) {
				parcial = valor - (valor * inssfx2);
			} else if (valor <= inss1) {
				parcial = valor - (valor * inssfx1);
			}

			double faixa1 = 1903.99;
			double faixa2 = 2826.66;
			double faixa3 = 3751.06;
			double faixa4 = 4664.68;

			double aliq1 = 0.075;
			double aliq2 = 0.15;
			double aliq3 = 0.225;
			double aliq4 = 0.275;

			double abat1 = 142.80;
			double abat2 = 354.80;
			double abat3 = 636.13;
			double abat4 = 869.36;
			double resultado = 0;

			if (parcial > faixa4) {
				resultado = (parcial - ((parcial * aliq4) - abat4));
			} else if (parcial >= faixa3) {
				resultado = (parcial - ((parcial * aliq3) - abat3));
			} else if (parcial >= faixa2) {
				resultado = (parcial - ((parcial * aliq2) - abat2));
			} else if (parcial >= faixa1) {
				resultado = (parcial - ((parcial * aliq1) - abat1));
			} else if (parcial < faixa1) {
				resultado = (parcial);
			}

			scanner.close();

			
			System.out.printf("liquido é %.2f", resultado);
		}

	} 




