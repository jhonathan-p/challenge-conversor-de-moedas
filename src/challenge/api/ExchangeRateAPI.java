package challenge.api;

import challenge.api.moedas.CalcularValor;
import com.google.gson.Gson;
import challenge.api.moedas.ConversionRates;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {
    public void converteMoeda() throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/6bdd7b81f4e8718fa3cef8bb/latest/USD";

        try {
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String body = httpResponse.body().toLowerCase();

            //Caso a chave da API não for mais válida, abaixo tem um JSON de testes.
            //Para usar: comente as linhas 18 até 23. Descomente a linha 27.
//        String body = "{\"result\":\"success\",\"documentation\":\"https://www.exchangerate-api.com/docs\",\"terms_of_use\":\"https://www.exchangerate-api.com/terms\",\"time_last_update_unix\":1713484801,\"time_last_update_utc\":\"Fri, 19 Apr 2024 00:00:01 +0000\",\"time_next_update_unix\":1713571201,\"time_next_update_utc\":\"Sat, 20 Apr 2024 00:00:01 +0000\",\"base_code\":\"USD\",\"conversion_rates\":{\"USD\":1,\"AED\":3.6725,\"AFN\":71.8801,\"ALL\":95.1256,\"AMD\":395.2758,\"ANG\":1.7900,\"AOA\":844.0816,\"ARS\":864.7500,\"AUD\":1.5554,\"AWG\":1.7900,\"AZN\":1.6999,\"BAM\":1.8357,\"BBD\":2.0000,\"BDT\":109.7486,\"BGN\":1.8353,\"BHD\":0.3760,\"BIF\":2855.5483,\"BMD\":1.0000,\"BND\":1.3614,\"BOB\":6.9276,\"BRL\":5.2407,\"BSD\":1.0000,\"BTN\":83.5798,\"BWP\":13.8384,\"BYN\":3.2719,\"BZD\":2.0000,\"CAD\":1.3759,\"CDF\":2753.4099,\"CHF\":0.9113,\"CLP\":977.9888,\"CNY\":7.2452,\"COP\":3903.0234,\"CRC\":500.8406,\"CUP\":24.0000,\"CVE\":103.4938,\"CZK\":23.6992,\"DJF\":177.7210,\"DKK\":7.0056,\"DOP\":59.0193,\"DZD\":134.6477,\"EGP\":48.3893,\"ERN\":15.0000,\"ETB\":56.9127,\"EUR\":0.9385,\"FJD\":2.2700,\"FKP\":0.8032,\"FOK\":7.0054,\"GBP\":0.8032,\"GEL\":2.6721,\"GGP\":0.8032,\"GHS\":13.5427,\"GIP\":0.8032,\"GMD\":66.5899,\"GNF\":8584.6595,\"GTQ\":7.7785,\"GYD\":209.4761,\"HKD\":7.8311,\"HNL\":24.7096,\"HRK\":7.0718,\"HTG\":132.5275,\"HUF\":370.0513,\"IDR\":16194.3069,\"ILS\":3.7899,\"IMP\":0.8032,\"INR\":83.5791,\"IQD\":1310.9029,\"IRR\":41997.0294,\"ISK\":140.7534,\"JEP\":0.8032,\"JMD\":155.7583,\"JOD\":0.7090,\"JPY\":154.5365,\"KES\":131.9445,\"KGS\":89.1985,\"KHR\":4052.4388,\"KID\":1.5548,\"KMF\":461.7568,\"KRW\":1377.6779,\"KWD\":0.3083,\"KYD\":0.8333,\"KZT\":446.9932,\"LAK\":20992.1873,\"LBP\":89500.0000,\"LKR\":301.2346,\"LRD\":194.3892,\"LSL\":19.1317,\"LYD\":4.8635,\"MAD\":10.1215,\"MDL\":17.9208,\"MGA\":4392.3675,\"MKD\":57.9168,\"MMK\":2097.2789,\"MNT\":3371.9982,\"MOP\":8.0661,\"MRU\":39.6586,\"MUR\":46.4728,\"MVR\":15.4482,\"MWK\":1740.5801,\"MXN\":17.0659,\"MYR\":4.7837,\"MZN\":63.9452,\"NAD\":19.1317,\"NGN\":1133.0294,\"NIO\":36.8397,\"NOK\":11.0392,\"NPR\":133.7277,\"NZD\":1.6925,\"OMR\":0.3845,\"PAB\":1.0000,\"PEN\":3.7405,\"PGK\":3.7983,\"PHP\":57.3080,\"PKR\":278.2500,\"PLN\":4.0681,\"PYG\":7377.0929,\"QAR\":3.6400,\"RON\":4.6623,\"RSD\":109.8066,\"RUB\":94.2006,\"RWF\":1299.3008,\"SAR\":3.7500,\"SBD\":8.5120,\"SCR\":13.5637,\"SDG\":512.0399,\"SEK\":10.9571,\"SGD\":1.3612,\"SHP\":0.8032,\"SLE\":22.6394,\"SLL\":22639.3931,\"SOS\":571.6999,\"SRD\":34.7732,\"SSP\":1566.9123,\"STN\":22.9955,\"SYP\":12935.7259,\"SZL\":19.1317,\"THB\":36.7912,\"TJS\":10.9343,\"TMT\":3.5004,\"TND\":3.1559,\"TOP\":2.3554,\"TRY\":32.5763,\"TTD\":6.7559,\"TVD\":1.5548,\"TWD\":32.4585,\"TZS\":2583.2127,\"UAH\":39.6129,\"UGX\":3809.9072,\"UYU\":38.8693,\"UZS\":12696.8812,\"VES\":36.3421,\"VND\":25373.7272,\"VUV\":122.1096,\"WST\":2.7769,\"XAF\":615.6758,\"XCD\":2.7000,\"XDR\":0.7587,\"XOF\":615.6758,\"XPF\":112.0040,\"YER\":250.3688,\"ZAR\":19.1271,\"ZMW\":25.4158,\"ZWL\":13.3437}}".toLowerCase();

            Gson gson = new Gson();

            ConversionRates conversionRates = gson.fromJson(body, ConversionRates.class);

            CalcularValor calcularValor = new CalcularValor();
            calcularValor.escolheMoeda1(conversionRates);
            calcularValor.escolheMoeda2(conversionRates);
            calcularValor.valorConverte();

        } catch (Exception e){
            System.out.println();
            System.out.println("Não foi possível se conectar ao servidor.");
            System.out.println("Leia a linha 25 do ExchangeRateAPI.java.");
            System.exit(0);
        }
    }
}
