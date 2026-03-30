package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main (String[] args){

        // + -/ *
        int numero1 = 10;
        int numero2 = 20;

        System.out.println( numero1 + numero2);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println(" isDezMaiorQueVinte" + isDezMaiorQueVinte);
        System.out.println(" isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println(" isDezIgualQueVinte" + isDezIgualQueVinte);
        System.out.println(" isDezIgualDez" + isDezIgualDez);
        System.out.println(" isDezDiferenteDez" + isDezDiferenteDez);

        // && (AND) || (or) ! (not)
        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 25 && salario > 2500;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario > 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta" +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaConrrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        // break na linha de é f9 deixe o cusor na linha que quer dar um break e clique em f9

        boolean isPlaystationCincoCompravel = valorTotalContaConrrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation; // alt + f8 selecione a linha completa do comando assim podemos visualizar os resultados sem executar o cõdigo.
        System.out.println("isPlaystationCincoCompravel" +isPlaystationCincoCompravel);


        // operadores de atribuicao
        // = += -= *= /= %=

        double bonus  = 1800;
        bonus += 2000 ;
        System.out.println(bonus);

        double vr = 500;
        vr -= 250;
        System.out.println(vr);

        double va = 5000;
        va *= 40;
        System.out.println(va);

        double diasDeFerias = 35;
        diasDeFerias /= 5;
        System.out.println(diasDeFerias);

        double diasTrabalhados = 365;
        diasTrabalhados %= 56;
        System.out.println(diasTrabalhados);

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador ++; // é o meu do exemplo acima, só que de uma forma mais simples
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2++);

    }
}
