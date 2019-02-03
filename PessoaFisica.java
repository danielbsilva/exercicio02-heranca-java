package heranca.exerc02;

public class PessoaFisica extends Pessoa {

	private double gastoSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double Imposto() {

		if (rendaAnual < 20000 && gastoSaude == 0) {
			return rendaAnual * 0.15;
		} else if (rendaAnual > 200000 && gastoSaude == 0) {
			return rendaAnual * 0.25;
		} else {
			return (rendaAnual * 0.25) - (gastoSaude * 0.5);
		}
	}
}
