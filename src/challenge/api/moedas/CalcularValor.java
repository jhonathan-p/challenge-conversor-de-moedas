package challenge.api.moedas;

import challenge.api.mensagens.Mensagens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularValor {
    private double moeda1 = 0;
    private double moeda2 = 0;
    private String moeda1Nome = "";
    private String moeda2Nome = "";

    public void escolheMoeda1(ConversionRates conversionRates) {
        System.out.print(Mensagens.mensagemMoeda1);
        while (moeda1 == 0) {
            try {
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    int escolha1 = scanner.nextInt();
                    switch (escolha1) {
                        case 1:
                            moeda1 = conversionRates.conversionRates().brl();
                            moeda1Nome = "BRL";
                            break;
                        case 2:
                            moeda1 = conversionRates.conversionRates().cad();
                            moeda1Nome = "CAD";
                            break;
                        case 3:
                            moeda1 = conversionRates.conversionRates().eur();
                            moeda1Nome = "EUR";
                            break;
                        case 4:
                            moeda1 = conversionRates.conversionRates().gbp();
                            moeda1Nome = "GBP";
                            break;
                        case 5:
                            moeda1 = conversionRates.conversionRates().jpy();
                            moeda1Nome = "JPY";
                            break;
                        case 6:
                            moeda1 = conversionRates.conversionRates().rub();
                            moeda1Nome = "RUB";
                            break;
                        case 7:
                            moeda1 = conversionRates.conversionRates().usd();
                            moeda1Nome = "USD";
                            break;
                        case 0:
                            System.exit(0);
                    }
                    if (moeda1 == 0) {
                        System.out.print("Por favor, escolha uma opção válida: ");
                    } else {
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.print("Por favor, escolha uma opção válida: ");
            }
        }
    }

    public void escolheMoeda2(ConversionRates conversionRates) {
        System.out.print(Mensagens.mensagemMoeda2);
        while (moeda2 == 0) {
            try {
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    int escolha2 = scanner.nextInt();
                    switch (escolha2) {
                        case 1:
                            moeda2 = conversionRates.conversionRates().brl();
                            moeda2Nome = "BRL";
                            break;
                        case 2:
                            moeda2 = conversionRates.conversionRates().cad();
                            moeda2Nome = "CAD";
                            break;
                        case 3:
                            moeda2 = conversionRates.conversionRates().eur();
                            moeda2Nome = "EUR";
                            break;
                        case 4:
                            moeda2 = conversionRates.conversionRates().gbp();
                            moeda2Nome = "GBP";
                            break;
                        case 5:
                            moeda2 = conversionRates.conversionRates().jpy();
                            moeda2Nome = "JPY";
                            break;
                        case 6:
                            moeda2 = conversionRates.conversionRates().rub();
                            moeda2Nome = "RUB";
                            break;
                        case 7:
                            moeda2 = conversionRates.conversionRates().usd();
                            moeda2Nome = "USD";
                            break;
                        case 0:
                            System.exit(0);
                    }
                    if (moeda2 == 0) {
                        System.out.print("Por favor, escolha uma opção válida: ");
                    } else {
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.print("Por favor, escolha uma opção válida: ");
            }
        }
    }

    public void valorConverte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensagens.mensagemValorConverte);
        double valor = 0;
        while (true) {
            try {
                valor = scanner.nextDouble();
                if (valor == 0) {
                    System.out.print("Por favor, digite um valor válido: ");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.print("Por favor, digite um valor válido: ");
                scanner.nextLine(); //wtf double???
            }
        }
        double valorConvertido = 1 / moeda1 * valor * moeda2;
        System.out.println();
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Câmbio: $ " + (1 / moeda1 * moeda2));
        System.out.println();
        System.out.println("$ " + valor + " " + moeda1Nome + " para " + moeda2Nome + ": $ " + valorConvertido);
    }
}