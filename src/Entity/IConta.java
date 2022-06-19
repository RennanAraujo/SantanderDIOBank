package Entity;

public interface IConta {
	//Quem implementar essa classe tem que implementar esse métodos
	//Interface define um contrato
	//Interface é uma classe abstrata (classe abstrata precisa que outra classe implemente seus métodos)
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, IConta contaDestino);
	void imprimirExtrao();
}
