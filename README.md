## Enunciado

Uma empresa "B2B" precisa registrar um cliente que tem interesse em seu produto. B2B é uma empresa com estrutura de processos bem definida, portanto a partir do momento em que um cliente possui interesse, a empresa deve passar, obrigatoriamente, sua razão social, seu CNPJ e uma forma de contato (pode ser e-mail ou telefone).

Após esse primeiro contato, o cliente é registrado como "Cliente em potencial", e deverá passar por várias etapas - um fluxo de trabalho - antes que o contrato possa ser fechado. O fluxo de trabalho e os campos são definidos da seguinte maneira:

0. Ao abrir:

- Razão Social
- CNPJ
- Contato

1. Cliente em potencial, tipo: aberto;
2. Apresentação, tipo: desenvolvimento;

- Data da apresentação

3. Criação da proposta, tipo: desenvolvimento;

- Produto
- Valor da proposta

4. Envio de proposta, tipo: desenvolvimento;

- Data do envio da proposta

5. Contrato enviado, tipo: desenvolvimento;

- Data do envio do contrato

6. Contrato assinado, tipo: desenvolvimento;

- Data da assinatura do contrato

7. Em operação assistida, tipo: concluído

Cada uma dessas etapas possui campos obrigatórios que são correlacionados com a etapa, ou seja, só aparecerão na etapa em que estão correlacionados. O processo do fluxo de trabalho precisa seguir de forma ordinal, do primeiro ao sétimo, sem pular nenhuma etapa.

Quando o cliente chega em contrato enviado, há uma opção de cancelar o fluxo de trabalho pelo motivo de desistência do cliente.

Quando o cliente chega em operação assistida, é necessário enviar um e-mail ao time de infraestrutura contendo todos os dados informados para criar um ambiente para o cliente recém conquistado.

Crie um arquivo txt como output contendo os dados.
