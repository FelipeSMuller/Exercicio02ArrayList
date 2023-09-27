package ArrayList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Exercício 2: Contagem de Palavras Crie um programa que solicita ao usuário
		 * que insira uma frase (uma string). O programa deve dividir a frase em
		 * palavras (separadas por espaços em branco) e armazenar essas palavras em um
		 * ArrayList. Em seguida, o programa deve contar e exibir quantas palavras foram
		 * inseridas.
		 */

		// Cria um ArrayList chamado "frases" para armazenar as palavras.

		ArrayList<String> frases = new ArrayList<>();

		// Cria um array de Strings chamado "palavras" com tamanho 20, mas ele não será
		// usado.

		String[] palavras = new String[20];

		// Declara uma variável "frase" para armazenar a frase fornecida pelo usuário.

		String frase;

		// Inicia um loop "do-while", que permite que o código dentro dele seja
		// executado pelo menos uma vez.

		do {

			try {

				// Solicita ao usuário que insira uma frase usando uma caixa de diálogo.

				frase = JOptionPane.showInputDialog(null, "Digite uma frase");

				// Converte a frase para letras maiúsculas).

				frase = frase.toUpperCase();

				// Verifica se a frase é nula ou vazia e exibe uma mensagem de erro.

				if (frase == null || frase.isEmpty()) {

					JOptionPane.showMessageDialog(null, "Você não pode deixar um campo vazio!");

					break;
				}

			} catch (NullPointerException | NumberFormatException erro) {

				JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente, ERRO!");

				break;

			}

			// Divide a frase em palavras usando o espaço em branco como delimitador e
			// armazena as palavras no array "palavras".

			palavras = frase.split(" ");

			// Adiciona cada palavra ao ArrayList "frases".

			for (String palavra : palavras) {
				frases.add(palavra);
			}

			// Obtém a quantidade de palavras no ArrayList "frases".

			int quantidadePalavras = frases.size();

			JOptionPane.showMessageDialog(null, "Quantidade de palavras inseridas = " + quantidadePalavras);

			break;

		} while (frase != null);

	}
}