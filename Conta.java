import java.util.Random;
public class Conta{
	Random rand = new Random();
	int numConta = rand.nextInt(10000,99999);
	double saldo = 0.0;
	String titular;
	String tipoConta;
}