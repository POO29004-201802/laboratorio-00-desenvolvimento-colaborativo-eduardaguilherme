package POO;

public class Exercicio02 {
    private void nEspacos(int n){
        for(; n > 0; n--){
            System.out.print(" ");
        }
    }


    private void linha(int espacamento){
        for(int j = 0; j <= espacamento; j++){
            if(j == 0 || j == espacamento) {
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void criaLosango(int h){
        for(int i = 0; i < h/2; i++){
            nEspacos(h/2-i);
            linha(2*i);
        }
        for(int i = h/2; i >= 0; i--){
            nEspacos(h/2-i);
            linha(2*i);
        }
    }
}
