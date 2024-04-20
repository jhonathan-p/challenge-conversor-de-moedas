## Conversor de moedas para o Challenge da Alura referente ao programa ONE - Oracle Next Education.<br><br>

O projeto Conversor de Moedas foi desenvolvido em Java usando IntelliJ IDEA Community Edition.<br>

Possui dependência da biblioteca gson-2.10.1.jar.<br>

Ele utiliza os dados da API de https://www.exchangerate-api.com/ e realiza conversões de acordo com as escolhas do usuário.<br><br><br>

Ao inciar o programa primeiramente uma lista das moedas mais utilizadas é exibida:<br>

<img src="md/moeda1.png" alt="Imagem da tela de início do programa.">

É possível também listar todas as moedas disponíveis e escolher pelo código.<br>

<img src="md/moedacodigo.png" alt="Imagem da lista de códigos de moedas.">

Ao escolher a primeira moeda será perguntado novamente para qual moeda você deseja converter o valor.<br>

<img src="md/moeda2.png" alt="Imagem da segunda moeda a escolher.">

Ao escolher a segunda moeda, deve ser digitado o valor a ser convertido.<br>

<img src="md/valoraconverter.png" alt="Imagem do valor a ser convertido.">

Após isso, o programa irá calcular a taxa de câmbio e converter de acordo.<br>

<img src="md/moedavalorconvertido.png" alt="Imagem do valor convertido e taxa de câmbio.">

Após fazer a conversão das moedas, o programa irá perguntar ao usuário o que ele deseja fazer.<br>

<img src="md/opcaofinal.png" alt="Imagem da opção final do programa.">

É possível mostrar a lista das conversões feitas durante o uso do programa conforme a opção escolhida.<br>

<img src="md/lista.png" alt="Imagem da lista de conversões de moedas.">

Caso ocorra algum erro durante a execução, o mais provável é que a chave da API não é mais válida.<br>
Existe um JSON de testes na classe ExchangeRateAPI.java que pode ser utilizado nessa situação, ou então a chave da API deve ser atualizada.<br> 

<img src="md/erro.png" alt="Imagem do erro.">

<br>
<br>

### Autores:
<a href="https://github.com/jhonathan-p" target="_blank">Jhonathan Pfeiffer Urbainski</a>