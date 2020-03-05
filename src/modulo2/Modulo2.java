/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo2;

/**
 *
 * @author Libny Zambrano
 */
public class Modulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Helper helper = new Helper();    //Instancia de la clase Helper
      helper.Saludo();                 //primer metodo un saludo
      helper.evaluacion(90);           //Segundo metodo retorna una evaluacion
      helper.division(68 ,4);          //Tercer metodo retorna el resultado de una division
      helper.numeros(4);               //Cuarto metodo retorna una lista del numero 1 al numero x que deseamos
      helper.primos();                 //Quinto metodo retorna los numeros primos del 1 al 100
      
                               }
    
    public static class Helper {
        public void Saludo() {
           System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo");
           System.out.println();
                             }
        public void evaluacion(int nota) {
           
        if (nota >=70){
           System.out.println("Aprobado");
           System.out.println();
        }else{
           System.out.println("Reprobado");
           System.out.println();
             }
          }
        public void division( int n1, int n2){
            int resultado = n1 / n2;
            if (n2 !=0){
           System.out.println(resultado);
           System.out.println();
            }
            else{
                System.out.println("La division no se puede realizar");
                System.out.println();
            }
        }
        public void numeros(int x){
            for(int i=1;i<=x;i++){
                System.out.println(i);
                
            }
            System.out.println(); 
        }
        public void primos(){
            int limite=100;
            for(int i=1;i<=limite;i++){
                int count=0;
            for(int j=1;j<=i;j++){
                if (i%j==0)
                    count++;
            }
            if (count==2)
                System.out.println(i);
            
        }
        }
    }
    
}
