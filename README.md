# Conta Terminal - Java Básico

## Desafio DIO

1 Criando um projeto de conta bancária via terminal.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revise sobre regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

# Resolução

O desafio era desenvolver um projeto para ser executado via terminal mesmo. Veja o código abaixo.

~~~java
package edu.dio.bank;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe sua agência (xxx-x): ");
        String agencia = scanner.next();

        System.out.println("Favor informar seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        String resposta = "Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.";

        System.out.println(resposta);

    }
}
~~~

E esse foi o retorno do teste via terminal.


![01](https://uploaddeimagens.com.br/images/004/748/451/original/01.png?1709057379)

---
