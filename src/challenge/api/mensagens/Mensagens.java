package challenge.api.mensagens;

public class Mensagens {
    public static String moeda1 = "Qual moeda você possui?";
    public static String moeda2 = "Para qual moeda você gostaria de converter?";

    public static String mensagemBoasVindas = """
            ***************************************
            BEM VINDOS AO CONVERSOR DE MOEDAS EM TEMPO REAL.
            """;

    public static String mensagemMoedaOpcoes = """
                            
            ***************************************
            %s
                            
            1 - USD - Dólar Americano
            2 - CAD - Dólar Canadense
            3 - EUR - Euro
            4 - JPY - Iene Japonês
            5 - GBP - Libra Esterlina
            6 - BRL - Real Brasileiro
            
            7 - Mostrar todas - Atenção! Lista extensa.
            
            0 - Sair
            ***************************************
                            
            Opção:\s""";

    public static String mensagemValorConverte = """
                            
            ***************************************
            Qual o valor a ser convertido?
            ***************************************
                            
            Valor: $\s""";

    public static String mensagemContinuarConvertendo = """                           
                        
            ***************************************
            O que deseja fazer agora?
                        
            1 - Converter outra moeda
            2 - Mostrar moedas convertidas
                        
            0 - Sair
            ***************************************
                            
            Opção:\s""";

    public static String mensagemListaMoedasTodas = """
            
            ***************************************
            %s
                          
            USD - Dólar Americano
            AED - Dirham dos Emirados Árabes Unidos
            AFN - Afegane
            ALL - Lek Albanês
            AMD - Dram Armênio
            ANG - Florim das Antilhas Neerlandesas
            AOA - Kwanza Angolano
            ARS - Peso Argentino
            AUD - Dólar Australiano
            AWG - Florim Arubano
            AZN - Manat Azerbaijano
            BAM - Marco Convertível da Bósnia-Herzegovina
            BBD - Dólar de Barbados
            BDT - Taka de Bangladesh
            BGN - Lev Búlgaro
            BHD - Dinar Bareinita
            BIF - Franco do Burundi
            BMD - Dólar Bermudense
            BND - Dólar do Brunei
            BOB - Boliviano
            BRL - Real Brasileiro
            BSD - Dólar das Bahamas
            BTN - Ngultrum Butanês
            BWP - Pula Botswanesa
            BYN - Rublo Bielorrusso
            BZD - Dólar de Belize
            CAD - Dólar Canadense
            CDF - Franco Congolês
            CHF - Franco Suíço
            CLP - Peso Chileno
            CNY - Yuan Chinês
            COP - Peso Colombiano
            CRC - Colón Costa-riquenho
            CUP - Peso Cubano
            CVE - Escudo Cabo-verdiano
            CZK - Coroa Tcheca
            DJF - Franco Djibutiense
            DKK - Coroa Dinamarquesa
            DOP - Peso Dominicano
            DZD - Dinar Argelino
            EGP - Libra Egípcia
            ERN - Nakfa Eritreia
            ETB - Birr Etíope
            EUR - Euro
            FJD - Dólar de Fiji
            FKP - Libra das Ilhas Falkland
            FOK - Coroa Feroesa
            GBP - Libra Esterlina
            GEL - Lari Georgiano
            GGP - Libra de Guernsey
            GHS - Cedi Ganês
            GIP - Libra de Gibraltar
            GMD - Dalasi Gambiano
            GNF - Franco Guineense
            GTQ - Quetzal Guatemalteco
            GYD - Dólar Guianense
            HKD - Dólar de Hong Kong
            HNL - Lempira Hondurenha
            HRK - Kuna Croata
            HTG - Gourde Haitiano
            HUF - Forint Húngaro
            IDR - Rupia Indonésia
            ILS - Novo Shekel Israelense
            IMP - Libra de Man
            INR - Rupia Indiana
            IQD - Dinar Iraquiano
            IRR - Rial Iraniano
            ISK - Coroa Islandesa
            JEP - Libra de Jersey
            JMD - Dólar Jamaicano
            JOD - Dinar Jordano
            JPY - Iene Japonês
            KES - Xelim Queniano
            KGS - Som Quirguiz
            KHR - Riel Cambojano
            KID - Dólar de Kiribati
            KMF - Franco Comoriano
            KRW - Won Sul-coreano
            KWD - Dinar Kuwaitiano
            KYD - Dólar das Ilhas Caimão
            KZT - Tenge Cazaque
            LAK - Kip Laociano
            LBP - Libra Libanesa
            LKR - Rupia do Sri Lanka
            LRD - Dólar Liberiano
            LSL - Loti Lesotense
            LYD - Dinar Líbio
            MAD - Dirham Marroquino
            MDL - Leu Moldávio
            MGA - Ariary Malgaxe
            MKD - Dinar Macedônio
            MMK - Kyat de Mianmar
            MNT - Tugrik Mongol
            MOP - Pataca de Macau
            MRU - Ouguiya da Mauritânia
            MUR - Rupia Mauriciana
            MVR - Rufiyaa Maldiva
            MWK - Kwacha Malauiano
            MXN - Peso Mexicano
            MYR - Ringgit Malaio
            MZN - Metical Moçambicano
            NAD - Dólar Namibiano
            NGN - Naira Nigeriano
            NIO - Córdoba Nicaraguense
            NOK - Coroa Norueguesa
            NPR - Rupia Nepalesa
            NZD - Dólar Neozelandês
            OMR - Rial Omanense
            PAB - Balboa Panamenho
            PEN - Sol Peruano
            PGK - Kina da Papua-Nova Guiné
            PHP - Peso Filipino
            PKR - Rupia Paquistanesa
            PLN - Zloty Polonês
            PYG - Guarani Paraguaio
            QAR - Rial Catariano
            RON - Leu Romeno
            RSD - Dinar Sérvio
            RUB - Rublo Russo
            RWF - Franco Ruandês
            SAR - Rial Saudita
            SBD - Dólar das Ilhas Salomão
            SCR - Rupia Seichelense
            SDG - Libra Sudanesa
            SEK - Coroa Sueca
            SGD - Dólar de Singapura
            SHP - Libra de Santa Helena
            SLE - Leone de Serra Leoa
            SLL - Leone da Serra Leoa
            SOS - Xelim Somali
            SRD - Dólar do Suriname
            SSP - Libra Sul-Sudanesa
            STN - Dobra de São Tomé e Príncipe
            SYP - Libra Síria
            SZL - Lilangeni da Suazilândia
            THB - Baht Tailandês
            TJS - Somoni Tajique
            TMT - Manat Turcomeno
            TND - Dinar Tunisiano
            TOP - Paʻanga Tonganesa
            TRY - Lira Turca
            TTD - Dólar de Trinidad e Tobago
            TVD - Dólar de Tuvalu
            TWD - Novo Dólar Taiwanês
            TZS - Xelim Tanzaniano
            UAH - Hryvnia Ucraniano
            UGX - Xelim Ugandense
            UYU - Peso Uruguaio
            UZS - Som Uzbeque
            VES - Bolívar Venezuelano
            VND - Dong Vietnamita
            VUV - Vatu de Vanuatu
            WST - Tala Samoano
            XAF - Franco CFA de África Central
            XCD - Dólar do Caribe Oriental
            XDR - Direitos Especiais de Saque
            XOF - Franco CFA de África Ocidental
            XPF - Franco CFP
            YER - Rial Iemenita
            ZAR - Rand Sul-africano
            ZMW - Kwacha Zambiano
            ZWL - Dólar do Zimbábue
            ***************************************
            
            Código:\s""";
}