package Entity;

public abstract class Conta implements IConta {
	//Quem implementa interface tem que implementar seus metodos
	//Usando override
	protected int agencia; //Protected permite que seja acessada pelas classes filhas
	protected int numero;
	protected double saldo;
	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 1;

	public Conta(){
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirInfosComuns() {
		System.out.printf("Agencia: %d%n", this.agencia); //printf substitui println com format
		System.out.printf("Numero: %d%n", this.numero); //%n pra pular de linha
		System.out.printf("Saldo: %.2f%n", this.saldo);
	}


	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
