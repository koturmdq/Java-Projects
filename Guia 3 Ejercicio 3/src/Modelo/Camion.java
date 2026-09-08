package Modelo;

import Interfaces.VehiculoDeCarga;

public class Camion extends Vehiculo implements VehiculoDeCarga {
    //Atributos
    private double capacidadDeCarga;

    //Constructor
    public Camion(String marca, String modelo, double velocidadMaxima, double capacidadDeCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public double obtenerCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    @Override
    public String toString() {
        return "\nMarca: " + obtenerMarca() +
                "\nModelo: " + obtenerModelo() +
                "\nVelocidad Maxima: " + obtenerVelocidadMaxima() +
                "\nCapacidad de Carga: " + capacidadDeCarga;
    }
}