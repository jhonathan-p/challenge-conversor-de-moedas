import challenge.api.ExchangeRateAPI;
import challenge.api.mensagens.Mensagens;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.print(Mensagens.mensagemBoasVindas);

        while (true) {
            ExchangeRateAPI exchangeRateAPI = new ExchangeRateAPI();
            exchangeRateAPI.converteMoeda();

            System.out.print(Mensagens.mensagemContinuarConvertendo);
            int continuarConvertendo = 0;
            while (continuarConvertendo != 1)
                try {
                    Scanner scanner = new Scanner(System.in);
                    continuarConvertendo = scanner.nextInt();
                    if (continuarConvertendo == 0) {
                        System.exit(0);
                    } else if (continuarConvertendo != 1) {
                        System.out.print("Por favor, escolha uma opção válida: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Por favor, escolha uma opção válida: ");
                }
        }
    }
}