package challenge.api.moedas;

import challenge.api.mensagens.Mensagens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularValor {
    private double moeda1Valor;
    private String moeda1Nome;
    private double moeda2Valor;
    private String moeda2Nome;
    private boolean primeiraMoeda = true;
    private String moedaNome;
    private double moedaValor;
    private double valor;
    private double valorConvertido;

    public String getMoeda1Nome() {
        return moeda1Nome;
    }

    public String getMoeda2Nome() {
        return moeda2Nome;
    }

    public double getValor() {
        return valor;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public void calculaMoedaPorOpcao(ConversionRates conversionRates) {
        moedaValor = 0;
        if (primeiraMoeda) {
            System.out.print(Mensagens.mensagemMoedaOpcoes.formatted(Mensagens.moeda1));
        } else {
            System.out.print(Mensagens.mensagemMoedaOpcoes.formatted(Mensagens.moeda2));
        }
        while (moedaValor == 0) {
            try {
                Scanner scanner = new Scanner(System.in);
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        moedaValor = conversionRates.conversionRates().get("usd");
                        moedaNome = "USD";
                        break;
                    case 2:
                        moedaValor = conversionRates.conversionRates().get("cad");
                        moedaNome = "CAD";
                        break;
                    case 3:
                        moedaValor = conversionRates.conversionRates().get("eur");
                        moedaNome = "EUR";
                        break;
                    case 4:
                        moedaValor = conversionRates.conversionRates().get("jpy");
                        moedaNome = "JPY";
                        break;
                    case 5:
                        moedaValor = conversionRates.conversionRates().get("gbp");
                        moedaNome = "GBP";
                        break;
                    case 6:
                        moedaValor = conversionRates.conversionRates().get("brl");
                        moedaNome = "BRL";
                        break;
                    case 7:
                        calculaMoedaPorCodigo(conversionRates);
                        break;
                    case 0:
                        System.exit(0);
                }
                if (moedaValor != 0) {
                    break;
                } else {
                    System.out.print("Por favor digite uma opção válida: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Por favor digite uma opção válida: ");
            }
        }
        if (primeiraMoeda) {
            moeda1Nome = moedaNome;
            moeda1Valor = moedaValor;
            primeiraMoeda = false;
            calculaMoedaPorOpcao(conversionRates);
        } else {
            moeda2Nome = moedaNome;
            moeda2Valor = moedaValor;
        }
    }


    public void calculaMoedaPorCodigo(ConversionRates conversionRates) {
        if (primeiraMoeda) {
            System.out.print(Mensagens.mensagemListaMoedasTodas.formatted(Mensagens.moeda1));
        } else {
            System.out.print(Mensagens.mensagemListaMoedasTodas.formatted(Mensagens.moeda2));
        }
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String codigoMoeda = scanner.nextLine();
                moedaNome = codigoMoeda.toUpperCase();
                moedaValor = conversionRates.conversionRates().get(codigoMoeda);
                break;
            } catch (NullPointerException e) {
                System.out.print("Por favor digite um código válido: ");
            }
        }
        if (primeiraMoeda) {
            moeda1Nome = moedaNome;
            moeda1Valor = moedaValor;
            primeiraMoeda = false;
            calculaMoedaPorOpcao(conversionRates);
        } else {
            moeda2Nome = moedaNome;
            moeda2Valor = moedaValor;
        }
    }


    public void calculaValorConvertido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensagens.mensagemValorConverte);
        valor = 0;
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
        valorConvertido = 1 / moeda1Valor * valor * moeda2Valor;
        System.out.println();
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Câmbio = $ " + (1 / moeda1Valor * moeda2Valor));
        System.out.println();
        System.out.println("$ " + valor + " " + moeda1Nome + " para " + moeda2Nome + " = $ " + valorConvertido);
    }
}