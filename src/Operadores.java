public class Operadores {

    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("****** Relacionais ******");

            int num1 = 0;

            int num2 = 10;

            boolean isMaior = num1 > num2;
            System.out.println("isMaior: " + isMaior);

            boolean isIgual = num1 == num2;
            System.out.println("isIgual: " + isIgual);

            boolean isDiff = num1 != num2;
            System.out.println("isDiff: " + isDiff);

            boolean isMaiorIgual = num1 >= num2;
            System.out.println("isMaiorIgual: " + isMaiorIgual);

            boolean isDentro10 = num1 >= 1 && num1 <= 10;
            System.out.println("isDentro10: " + isDentro10);

            boolean isDentroOu10 = num1 >= 1 || num1 <= 10;
            System.out.println("isDentroOu10: " + isDentroOu10);

            boolean isNot = num1 >= 1;
            System.out.println("isNot: " + !isNot);
    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("****** Incremento e Decremento ******");

            int num1 = 10;
            System.out.println(num1);

            num1++;
            // Serve para adicionar 1 ao valor da variável de forma simples
            System.out.println(num1);

            num1--;
            // Serve para subtrair 1 ao valor da variável de forma simples
            System.out.println(num1);
    }

    public static void operacoesAtribuicoes() {
        System.out.println("****** Atribuições ******");

            int numero1 = 10;
            System.out.println("O valor da variável numero1 é " + numero1);

            int numero2 = 15;
            System.out.println("O valor da variável numero2 é " + numero2);

            int numero3 = numero1 + numero2;
            // Estou dizendo que, o numero3 é igual a soma do numero1(10) + numero2(15), logo o valor total do
            // numero3 é de 25
            System.out.println("A soma do numero1 + numero2 será o valor do numero3 " + numero3);

            numero3 += numero1;
            // O valor da variável numero3 é somado a outra variável, logo o valor do numero3 passa a ser o
            // resultado da soma
            System.out.println("O valor da variável numero3 somado a variável numero1 dará " + numero3);
    }
    public static void operacoesAritmeticas() {
        System.out.println("****** Aritméticas ******");

            int num1 = 10;
            System.out.println("num1 é igual a: " + num1);

            int num2 = 15;
            System.out.println("num2 é igual a: " + num2);

            int num3 = 15 + 15;
            System.out.println("num3 é a soma de 15 + 15: " + num3);

            int num4 = 15 / 2;
            System.out.println("num4 é 15 dividido por 2: " + num4);

            int num5 = 15 * 2;
            System.out.println("num5 é 15 vezes 2: " + num5);
    }


}
