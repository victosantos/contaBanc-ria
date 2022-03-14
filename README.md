Um banco possui diferentes tipos de transações que pode realizar, dentre elas estão:
Depósito, Transferência, Saque em Dinheiro, Consulta de Saldo, Pagamento de
Serviços. Todas as transações têm dois métodos em comum, que são transacaoOk() e
transacaoNaoOk().
Com base nisso, existem diferentes tipos de clientes que podem interagir com o
banco:
● Executivos: Fazem Depósitos e Transferências.
● Básico: Realizam consultas de saldo, pagamentos de serviços e saques em
dinheiro.
● Cobradores: Eles fazem saques em dinheiro e consultam saldos.

Implemente o cenário acima permitindo aos clientes mencionados acima, o acesso
aos diferentes métodos dependendo da operação que desejam realizar.

Nota:
● Não é necessário implementar cálculos ou funções matemáticas. Os métodos
podem ser implementações de mensagens usando System.out.println. Por
exemplo, ao fazer um depósito, a mensagem “Fazendo um depósito” aparece.
● Básico, Cobradores e Executivos podem ser tratados como classes.
● A transação pode ser tratada como uma Interface. Observe que existem
diferentes tipos de transações que implementarão essa interface principal.
