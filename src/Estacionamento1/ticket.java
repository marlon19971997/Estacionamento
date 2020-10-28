/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1
 */
public class ticket{
    
  int id;
  public double horario;
  public String data;
  private String codigo;
  
  
  
  public ticket(){
      
      System.out.println("ticket imprimido");
  }
  
  public ticket(String data, String codigo, double horario, int id){
      
      this.data = data;
      this.codigo = codigo;
      this.horario = horario;
      this.id = id ; 
  }
  
  public void imprimir() {
      
      String texto = "o ticket " + this.id + "imprimido com sucesso!";
      JOptionPane.showMessageDialog(null, texto);
      this.id = (int) (Math.random() * 30 + 1);
  }
  
 } 
  
  
  