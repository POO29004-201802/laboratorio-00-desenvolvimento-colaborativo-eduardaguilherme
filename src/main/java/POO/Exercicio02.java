package POO;

public class Exercicio02 {
    private void nEspacos(int n){
        for(; n > 0; n--){
            System.out.print(" ");
        }
    }



    public void criaLosango(int h){
        for(int i = 0; i < h/2; i++){
            nEspacos(h/2-i);
        }
        for(int i = h/2; i >= 0; i--){
            nEspacos(h/2-i);
        }
    }
}
