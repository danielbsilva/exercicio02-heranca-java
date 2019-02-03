package heranca.exerc02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Entre com o número de contribuintes: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + " dados:");
			System.out.print("Individual ou empresa (i/e)? ");
			char tipo = scan.next().charAt(0);
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = scan.nextDouble();
			if (tipo == 'i' || tipo == 'I') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = scan.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else if (tipo == 'e' || tipo == 'E') {
				System.out.print("Número de funcionários: ");
				int qtdFuncionarios = scan.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, qtdFuncionarios));
			}
		}
		double imposto = 0;
		System.out.println();
		System.out.println("Contribuintes: ");
		for (Pessoa p : list) {
			System.out.print(p.getNome() + ": $ ");
			System.out.println(String.format("%.2f", p.Imposto()));
		}
		for (Pessoa p : list) {
			imposto += p.Imposto();
		}
		System.out.printf("Total de taxas: $ %.2f%n", imposto);
		scan.close();
	}
}
