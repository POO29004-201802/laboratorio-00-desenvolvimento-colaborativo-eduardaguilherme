package POO;

public class Exercicio01 {
    public void criaRetangulo(int dim){
        for(int i = 0; i < dim; i++){
            if(i == 0 || i == dim-1){
                for(int j = 0; j < dim; j++){
                    if(j == 0 || j == dim-1){
                        System.out.print("+");
                    } else{
                        System.out.print("-");
                    }
                }
            } else{
                for(int j = 0;j < dim; j++){
                    if(j == 0 || j == dim-1) {
                        System.out.print("|");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}