package matriz;

public class Matriz {
//creacion de matrices
    int[][] enteros;
    int[][] enteros2; 
    int[][] resultado;
    public Matriz(int i, int j) {
        enteros = new int[i][j];
        enteros2= new int[i][j];
        resultado= new int[i][j];
        
    }
//    llenado de la primera matriz
    public void llenadodematriz() {

        int l = 0;
        for (int i = 0; i < enteros.length; i++) {

            for (int j = 0; j < enteros.length; j++) {

                enteros[i][j] = l;
                l++;

            }
        }
      }
//      llenado de la segunda matriz
    public void lenadodematriz2(){
        int m=0;
        for (int i = 0; i < enteros2.length; i++) {

            for (int j = 0; j < enteros2.length; j++) {
                
                enteros2[i][j]= m;
                m++;
                
            }
                
        }
    }
//    Operacion en las matrices
    public void operacionmatriz(){
        for (int i = 0; i < enteros.length; i++) {

            for (int j = 0; j < enteros2.length; j++) {
                resultado[i][j] = enteros[i][j] + enteros[i][j];
                
            }    
        }
    }
//    Metodo para imprimir las matrices y su resultdo
    public void imprimirmatriz() {
        for (int i = 0; i < enteros.length; i++) {

            for (int j = 0; j < enteros.length; j++) {
                System.out.print("("+ enteros[i][j]+ ")");
            }
            
            if(i==1){
                System.out.print("  +   ");
            }else{
                System.out.print("      ");
            }
            for (int j = 0; j < enteros2.length; j++) {
                System.out.print("("+ enteros2[i][j]+ ")");
            }
            
            if(i==1){
                System.out.print("  =   ");
            }else{
                System.out.print("      ");
            }
             for (int j = 0; j < resultado.length; j++) {
                System.out.print("("+ resultado[i][j]+ ")");
            }
            System.out.println("");
        }
    }
}