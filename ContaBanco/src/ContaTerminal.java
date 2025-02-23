import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando uma instancia da classe Scanner()
        Scanner scan = new Scanner(System.in);

        String nomeCliente;
        double saldo;
        int numero;
        String agencia;

        System.out.println("Digite o número da agência: ");
        agencia = scan.nextLine();
        
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Digite o número de usuário: ");
        numero = scan.nextInt();

        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        scan.close();

    }
}
