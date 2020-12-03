/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento1;

/**
 *
 * @author 1
 */
public class Documentoentrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Veiculo veic = new Veiculo();
      
        veic.modelo = "focus";
        veic.placa = "AMV2525";
        veic.potencia = 1.0;
              
        
                System.out.println("modelo:" + veic.modelo +"\nplaca:" + veic.placa
                        + "\npotencia:" + veic.potencia);
    
    
                
                
    ticket t1 = new ticket();
    
    t1.data = "vinte e dois de dezembro";
    t1.horario = 15.59 ;
    t1.id = 20 ;
    
   
    carro c1 = new carro();
 
    c1.modelo = "focus " ;
    c1.nportas = 1;
    c1.placa = "AMV2525";
    c1.potencia = 1.0; 
    c1.kilometragem = 10.000;
       
    
    moto m1 = new moto();
    
     m1.chassi = 1;
     m1.chassi = 2;
     
  } 
    

    
}
 