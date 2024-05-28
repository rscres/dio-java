import java.util.Scanner;

public class ContaTerminal {
    static int i = 0;

    public static String getInfo(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        String info = "";
        if (scanner.hasNext())
            info = scanner.next();
        
        if (++i == 4)
            scanner.close();
        return info; 
    }

    public static void main(String[] args) {
        int     account;
        String  agency;
        String  client;
        float   balance;

        account = Integer.parseInt(getInfo("Insira sua conta: "));
        agency = getInfo("Insira sua agência: ");
        client = getInfo("Insira seu nome: ");
        balance = Float.parseFloat(getInfo("Insira seu saldo: "));

        System.out.println("Olá " + client + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo " + String.format("%.2f", balance) + " já está disponível para saque");
    }

}
