/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author 1
 */
public class operador{
    
  public double cpf;
  public int idade;
  public String nome;
    private String placa;
   
  
  
  public operador(){
      
  }
  
  public operador(String nome, double cpf, int idade){
      
      this.nome = nome;
      this.cpf = cpf;
      this.idade = idade;
  }
  
private void imprimir(){
    String texto = "nome:" + this.nome +"\ncpf:" + this.placa
                        + "\nidade:" + this.idade;
    
    Component cmpnt = null;
 JOptionPane.showMessageDialog(cmpnt, texto);

}   
       
 } 
  
  
  
  
  
  
  