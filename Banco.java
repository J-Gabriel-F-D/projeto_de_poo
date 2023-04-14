import java.util.Scanner;
import java.util.ArrayList;
public class Banco{
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<>();

		Conta conta1 = new Conta();
		conta1.titular = "Gabriel";
		conta1.tipoConta = "Poupanca";
		Conta conta2 = new Conta();
		conta2.titular = "Juliany";
		conta2.tipoConta = "Poupanca";
		Conta conta3 = new Conta();
		conta3.titular = "Bianca";
		conta3.tipoConta = "Poupanca";

		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);

		Scanner scan = new Scanner(System.in);
		boolean continua = true;
		System.out.println("Seja Bem-Vindo ao Gerenciador de Contas Bancarias\n");
		do{
			System.out.println("Escolha um das opcoes abaixo para proseguir");
			System.out.println("\t 1: Criar conta");
			System.out.println("\t 2: Imprimir Contas");
			System.out.println("\t 3: Verificar saldo da conta");
			System.out.println("\t 0: Finalizar o programa");
			int esco = scan.nextInt();// variável de esco = Escolha
			switch(esco){
				case 1:
					Conta newConta = new Conta();
					String nome;
					System.out.println("Informe seu nome: ");
					nome = scan.next();
					newConta.titular = nome;
					System.out.println("Escolha o tipo da conta: ");
					int cont; // variável de controle cont = Controle
					System.out.println("\t1: Conta corrente");
					System.out.println("\t2: Conta Poupanca");
					cont = scan.nextInt();
					switch(cont){
						case 1:
							newConta.tipoConta = "Corrente";
							break;
						case 2:
							newConta.tipoConta = "Poupanca";
							break;
						default:
							System.out.println("Não existe essa opcao");
					}
					contas.add(newConta);
					System.out.println("Conta criada com sucesso !");
					break;
				case 2:
					if (contas.get(0)!= null) {
						System.out.println("======= Contas =======");

						for (int i = 0; i <= contas.size()-1; i++ ) {
							System.out.println("\n\tTitular: "+contas.get(i).titular);
							System.out.println("\tSaldo: "+contas.get(i).saldo);
							System.out.println("\tTipo da conta: "+contas.get(i).tipoConta);
							System.out.println("\tNumero da conta: "+contas.get(i).numConta);								
						}
					}
					break;
				case 3:
					if (contas.get(0)!= null) {
						int num;
						System.out.println("Informe o Numero da Conta: ");
						num = scan.nextInt();
						for (int i = 0; i <= contas.size()-1; i++ ) {
							if (contas.get(i).numConta == num) {
								System.out.println("\tSaldo: "+contas.get(i).saldo);
							}
						}
					}
					break;
				case 0:
					continua = false;
					System.out.println("O programa foi encerrado");
					break;
				default:
					System.out.println("Não existe essa opcao");
				
			}
		}while(continua);
	}
}