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
    }
}
