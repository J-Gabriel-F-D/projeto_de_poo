import java.util.Scanner;
import java.util.ArrayList;
public class Banco{
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Seja Bem-Vindo ao Gerenciador de Contas Bancarias\n");
		System.out.println("Escolha um das opcoes abaixo para proseguir");
		System.out.println("\t 1: Criar conta");
		System.out.println("\t 2: Imprimir Contas");
		System.out.println("\t 3: Verificar saldo da conta");
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
				break;
			case 2:
				Conta addConta = new Conta();
				addConta.titular = "Gabriel";
				addConta.saldo = 1349.50;
				addConta.tipoConta = "corrente";
				contas.add(addConta);
				System.out.println("======= Contas =======");
				System.out.println("\n\tTitular: "+contas.get(0).titular);
				System.out.println("\tSaldo: "+contas.get(0).saldo);
				System.out.println("\tTipo da conta: "+contas.get(0).tipoConta);
				System.out.println("\tNumero da conta: "+contas.get(0).numConta);
				break;
			case 3:
				Conta contaExp = new Conta();
				contaExp.numConta = 11111;
				contas.add(contaExp);
				int num;
				System.out.println("Informe o Numero da Conta(use 11111 para Imprimir uma conta exemplo): ");
				num = scan.nextInt();
				if(num == contas.get(0).numConta){
					System.out.println("O saldo eh: "+contas.get(0).saldo);
				}
				break;
			default:
				System.out.println("Não existe essa opcao");
			
		}
	}
}