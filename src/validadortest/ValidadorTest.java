/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadortest;

import br.com.wander.validador.Validador;

/**
 *
 * @author wanderlei
 */
public class ValidadorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 

        if  ( Validador.validaCPF("828.993.207- 34")) {
            System.out.println("CPF Validado com sucesso.");
        } else {

            System.out.println("CPF Inválido.");
        }
    }

}
