package jogo;

import java.util.Random;
import java.util.Scanner;

public class Proj_jogo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random num = new Random();

		int numeroUsuario;
		int escolhaComputador;

		numeroUsuario = teclado.nextInt();
		escolhaComputador = num.nextInt(3) + 1;
		
		switch (escolhaComputador) {

		case 1:
			System.out.println("Computador escolheu papel");
			break;

		case 2:
			System.out.println("Computador escolheu pedra");
			break;

		case 3:
			System.out.println("Computador escolheu tesoura");
			break;
		}

		if (numeroUsuario == escolhaComputador) {
			System.out.println("Empate");
		} else if ((numeroUsuario - escolhaComputador) == -1 || (numeroUsuario - escolhaComputador) == 2) {
			System.out.println("Usuário vencedor");
		} else {
			System.out.println("Computador venceu");
		}
	}

}
