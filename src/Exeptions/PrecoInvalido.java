/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exeptions;

/**
 *
 * @author Vitor
 */
public class PrecoInvalido extends NumberFormatException{
    
    
    public PrecoInvalido(){
       System.out.println("Preco inválido");
    }
}
