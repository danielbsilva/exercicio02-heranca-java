package heranca.exerc02;

public class PessoaJuridica extends Pessoa {

	private int qtdFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int qtdFuncionarios) {
		super(nome, rendaAnual);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	@Override
	public double Imposto() {

		if (qtdFuncionarios > 10) {
			return rendaAnual * 0.14;
		} else
			return rendaAnual * 0.16;
	}
}
