/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author 1
 */
public class Veiculo {
  
    public String modelo;
    public String placa;
    public double potencia;
    
    public Veiculo (){       
       
    }

public Veiculo (String modelo , String placa , double potencia){  

    this.modelo = modelo;
    this.potencia = potencia;
    this.placa = placa;
       
 }   



public void imprimir (){
String texto = "modelo: " + this.modelo +"\n" +
               "potencia: " + this.potencia +"\n" +
               "placa: " + this.placa;

        Component cmpnt = null;
    JOptionPane.showMessageDialog(cmpnt, texto);
}

}
    
    

