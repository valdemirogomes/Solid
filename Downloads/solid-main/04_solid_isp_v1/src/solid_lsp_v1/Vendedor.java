package solid_lsp_v1;

class Vendedor extends Funcionario implements Comissionavel{

	private float totalVendas;

	public Vendedor(float salario, String cargo, String nome, float totalVendas) {
		super(salario, cargo, nome);
		this.totalVendas = totalVendas;
	}

	public float getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(float totalVendas) {
		this.totalVendas = totalVendas;
	}

	// Método Calcular Salário - Classe Funcionario
	@Override
	public float calcularSalario(){
		return this.getSalario() + this.calcularComissao();
	}

	// Método Calcular Comissão - Interface Comissionavel
	@Override
	public float calcularComissao() {
		return this.totalVendas * 0.1f;
	}

	@Override
	float calcularBonus() {
		return 0;
	}

}