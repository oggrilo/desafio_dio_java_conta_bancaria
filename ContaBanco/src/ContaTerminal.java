import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao Sistema de Criação de Contas do Banco DIO \\n Por favor, digite o seu Nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite a quantidade de saldo que deseja colocar na sua Conta!");
        double saldo = scanner.nextDouble();

        //exibir as mensagens para o usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é : " + agencia + ", conta: " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        

        //obter pela scanner os valores digitados no terminal

        //exibir a mensagem de contra criada
        
    }
}
