/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import Institucion.institucion;

/**
 *
 * @author USUARIO PC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        institucion institucion = new institucion();
        institucion institucion2 = new institucion();
        institucion institucion3 = new institucion();
        institucion.establecerNombre("UTPl");
        institucion.establecerTipoIns("Privada");
        institucion.establecerNumeroDocentes(54);
        institucion.establecerNumeroCedes(5);
        institucion2.establecerNombre("UCE");
        institucion2.establecerTipoIns("Publica");
        institucion2.establecerNumeroDocentes(204);
        institucion2.establecerNumeroCedes(2);
        institucion3.establecerNombre("UIDE");
        institucion3.establecerTipoIns("Privada");
        institucion3.establecerNumeroDocentes(84);
        institucion3.establecerNumeroCedes(9);
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion.obtenerNombre(), institucion.obtenerTipoIns(),
                institucion.obtenerNumeroDocentes(), institucion.obtenerNumeroCedes());    
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion2.obtenerNombre(), institucion2.obtenerTipoIns(),
                institucion2.obtenerNumeroDocentes(), institucion2.obtenerNumeroCedes());  
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion3.obtenerNombre(), institucion3.obtenerTipoIns(),
                institucion3.obtenerNumeroDocentes(), institucion3.obtenerNumeroCedes());
    }
    
}
