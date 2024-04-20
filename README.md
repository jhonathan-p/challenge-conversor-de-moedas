Esse projeto Conversor de Moedas desenvolvido em Java usando IntelliJ IDEA Community Edition. Possui dependência da biblioteca gson-2.10.1.jar.
Ele utilizada os dados da API de https://www.exchangerate-api.com/ e realiza conversões de acordo com as escolhas do usuário.

Ao inciar o conversor ele mostra primeiramente uma lista das moedas mais utilizadas.

<img src="md/moeda1.png" alt="Imagem da tela de início do programa.">

É possível também listar todas as moedas disponíveis e escolher pelo código.

<img src="md/moedacodigo.png" alt="Imagem da lista de códigos de moedas.">

Ao escolher a primeira moeda será perguntado para qual moeda você quer converter o valor.

<img src="md/moeda2.png" alt="Imagem da segunda moeda a escolher.">

Deve ser digitado o valor a ser convertido.

<img src="md/valoraconverter.png" alt="Imagem do valor a ser convertido.">

Após isso, o programa irá calcular a taxa de câmbio e converter de acordo.

<img src="md/moedavalorconvertido.png" alt="Imagem do valor convertido e taxa de câmbio.">

Após fazer a conversão das moedas, o programa irá perguntar o que o usuário deseja fazer.

<img src="md/opcaofinal.png" alt="Imagem da opção final do programa.">

Será mostrado a lista das conversões feitas durante o uso do programa.

<img src="md/lista.png" alt="Imagem da lista de conversões de moedas.">

Caso ocorra algum erro durante a execução, o mais provável é que a chave da API não é mais válida.
Existe um JSON de testes na classe ExchangeRateAPI.java que pode usar utilizado nessa situação, ou então a chave da API deve ser atualizada. 

<img src="md/erro.png" alt="Imagem do erro.">

