import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = getInfo(scanner, 1);
        String input2 = getInfo(scanner, 2);

        try {
            contar(Integer.parseInt(input1), Integer.parseInt(input2));
        } catch (InvalidParametersException err) {
            System.out.println(err.getMessage());
        }
        scanner.close();
    }

    static String getInfo(Scanner scanner, int param) {
        String regex = "[\\-\\+\\d]?\\d+";

        System.out.print("Insira o parâmetro " + param + ": ");
        String input = scanner.next();
        while (!input.matches(regex)) {
            System.out.print("Parâmetro precisa ser numérico. Insira novamente: ");
            input = scanner.next();
        }
        return input;
    }

    static void contar(int input1, int input2) throws InvalidParametersException {
        if (input1 >= input2)
            throw new InvalidParametersException("Erro: parâmetro 2 deve ser maior que o parâmetro 1");
        int max = Math.abs(input2 - input1);
        for (int i = 1; i <= max; i++) {
            System.out.println("Imprimindo: " + i);
        }
    }
    
    public static class InvalidParametersException extends Exception { 
        public InvalidParametersException(String message) {
            super(message);
        }
    }
}
