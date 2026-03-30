package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
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

    }
}
