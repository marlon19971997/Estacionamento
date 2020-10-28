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
public class carro extends Veiculo{
    
    public double kilometragem;
    public int nportas;
    
    public carro (){   

    }

public carro (double kilometragem , int nportas ) {   
    
this.kilometragem = 10.000;
this.modelo = "focus";
this.nportas = 4;
this.placa = "AMV2525";
this.potencia = 1.0 ;

}

    @Override
    public void imprimir() {
        super.imprimir(); 
    }



}
