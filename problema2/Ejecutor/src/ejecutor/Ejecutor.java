/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import equivalenteHora.equivalenteHora;

/**
 *
 * @author USUARIO PC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        equivalenteHora equivalente = new equivalenteHora();
        equivalente.establecerHora(10);
        equivalente.establecerMinutos();
        equivalente.establecerSegundos();
        equivalente.establecerDias();
        System.out.printf("Minutos = %.2f\nSegundos = %.2f\nDias = %.2f\n", 
                equivalente.obtenerMinutos(), equivalente.obtenerSegundos(),
                equivalente.obtenerDias());
    }
    
}
