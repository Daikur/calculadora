/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author daw1
 */
public class MiError extends RuntimeException {

    public MiError(String mensaje) {
        super(mensaje);
    }
}
