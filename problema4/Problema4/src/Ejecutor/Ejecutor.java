/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import celular.celular;

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
        celular celular = new celular();
        celular.establecerSistema("IOS");
        celular.establecerTamaño(60);
        celular.establecerCosto(400);
        celular.establecerDireccionMac("00;e1;c8;64:d3");
        celular.establecerInformacionIMEI("123456789012345");
        System.out.printf("Tipo de sistema: %s\nTamaño de pantalla: "
                + "%.2f\nCosto: %.2f\nDireccion Mac: %s\nInformaición "
                + "IMEI: %s\n", celular.obtenerSistema(),
                celular.obtenerTamaño(), celular.obtenerCosto(),
                celular.obtenerDireccionMac(), celular.obtenerInformacionIMEI());
    }
    
}
