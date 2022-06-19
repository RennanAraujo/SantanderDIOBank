package Entity;

public class ContaCorrente extends Conta {

	@Override //Pq esse metodo foi implementado aqui e não os demais??
	public void imprimirExtrao() {
		System.out.println("======Extrato Conta Corrente======");
		imprimirInfosComuns();
	}

}
