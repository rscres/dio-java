import java.util.Scanner;

public class ContaTerminal {
    static int i = 0;

    public static String getInfo(String message, String regex) {
        Scanner scanner = new Scanner(System.in);

        String info = "";
        do {
            System.out.print(message);
            if (scanner.hasNextLine()) {
                info = scanner.nextLine();
            }
        } while (!info.matches(regex));
        
        if (++i == 4)
            scanner.close();
        return info; 
    }

    public static String insertHyphen(String agency) {
        System.out.println(agency.length());
        if (agency.length() == 5)
            return agency;
        return agency.substring(0, 3) + "-" + agency.substring(3);
    }

    public static void main(String[] args) {
        int     account;
        String  agency;
        String  client;
        float   balance;

        account = Integer.parseInt(getInfo("Insira sua conta[4 digitos]: ", "\\d{4}"));
        agency = getInfo("Insira sua agência[4 digitos]: ", "\\d{3}-?\\d");
        client = getInfo("Insira seu nome: ", "[A-Za-z\\- ]+");
        balance = Float.parseFloat(getInfo("Insira seu saldo: ", "\\d+(\\.\\d{1,2})?"));

        System.out.println("Olá " + client + ", obrigado por criar uma conta em nosso banco, sua agência é " + insertHyphen(agency) + ", conta " + account + " e seu saldo " + String.format("%.2f", balance) + " já está disponível para saque.");
    }

}
