import challenge.api.ExchangeRateAPI;
import challenge.api.mensagens.Mensagens;
import challenge.api.moedas.CalcularValor;
import challenge.api.moedas.listas.ListaConversoes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<ListaConversoes> list = new ArrayList<>();
        System.out.print(Mensagens.mensagemBoasVindas);

        while (true) {
            ExchangeRateAPI exchangeRateAPI = new ExchangeRateAPI();
            CalcularValor calcularValor = new CalcularValor();

            calcularValor.calculaMoedaPorOpcao(exchangeRateAPI.getConversionRates());
            calcularValor.calculaValorConvertido();

            ListaConversoes listaConversoes = new ListaConversoes(calcularValor.getMoeda1Nome(),
                    calcularValor.getValor(), calcularValor.getMoeda2Nome(), calcularValor.getValorConvertido());

            list.add(listaConversoes);

            int continuarConvertendo = 0;
            System.out.print(Mensagens.mensagemContinuarConvertendo);
            while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    continuarConvertendo = scanner.nextInt();
                    if (continuarConvertendo == 0) {
                        System.exit(0);
                    } else if (continuarConvertendo == 1) {
                        break;
                    } else if (continuarConvertendo == 2) {
                        System.out.println();
                        System.out.println("Lista de converções feitas:");
                        for (ListaConversoes conversoes : list) {
                            System.out.println(conversoes);
                        }
                        System.out.print(Mensagens.mensagemContinuarConvertendo);
                    } else {
                        System.out.print("Por favor, escolha uma opção válida: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Por favor, escolha uma opção válida: ");
                }
            }
        }
    }
}