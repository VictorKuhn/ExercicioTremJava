import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tipo de trilho (1 para infinito, 2 para finito): ");
        int tipoTrilho = scanner.nextInt();

        Trem trem;

        if (tipoTrilho == 1) {
            System.out.print("Informe a posição inicial do trem no trilho infinito: ");
            int posicaoInicial = scanner.nextInt();
            trem = new TremTrilhoInfinito(posicaoInicial);
        } else {
            System.out.print("Informe o limite mínimo do trilho finito: ");
            int limiteMinimo = scanner.nextInt();
            System.out.print("Informe o limite máximo do trilho finito: ");
            int limiteMaximo = scanner.nextInt();
            System.out.print("Informe a posição inicial do trem no trilho finito: ");
            int posicaoInicial = scanner.nextInt();
            trem = new TremTrilhoFinito(limiteMinimo, limiteMaximo, posicaoInicial);
        }

        System.out.print("Informe a lista de comandos (separados por espaço, máximo 30 comandos): ");
        scanner.nextLine();
        String listaComandos = scanner.nextLine();
        String[] comandos = listaComandos.split(" ");

        if (comandos.length > 30) {
            System.out.println("Número máximo de comandos permitido é 30.");
            scanner.close();
            return;
        }

        System.out.println("Comandos informados: " + listaComandos);
        System.out.println("Posição Inicial: " + trem.getPosicao());

        for (String comando : comandos) {
            trem.mover(comando);
        }

        System.out.println("Posição Final: " + trem.getPosicao());

        scanner.close();
    }
}