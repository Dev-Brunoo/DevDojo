package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args){

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // ! diferente

        if(isAutorizadoComprarBebida){
            System.out.println("usuario é maior");
        }
        if(!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizado a comprar bebida alcólica");

        }

        boolean c = false;
        if( c == true){
            System.out.println("entrei aquui");
        }

        double conta = 1000000;
        if(conta >= 90000){
            System.out.println("nao sou milhonario");
        } else if (conta <= 2000000) {
            System.out.println("sou milhonario");

        }

    }
}
