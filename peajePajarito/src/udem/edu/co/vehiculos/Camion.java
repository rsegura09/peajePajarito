/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vehiculos;

/**
 *
 * @author segur
 */
public class Camion {
    //atributos globales
    private String marca;
    private String placa;
    private long valorPeaje;
    /**
     *
     * Constructor de la clase 
    */
    public Camion() {
        
    }

    public Camion(String marca, String placa, long valorPeaje) {
        this.marca = marca;
        this.placa = placa;
        this.valorPeaje = valorPeaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(long valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "Camion{" + "marca=" + marca + ", placa=" + placa + ", valorPeaje=" + valorPeaje + '}';
    }
    
    
    
}
