import Entity.Conta;
import Entity.ContaCorrente;
import Entity.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		cc.depositar(100);
		cc.transferir(100, cp);

		cc.imprimirExtrao();
		cp.imprimirExtrao();
	}
}
