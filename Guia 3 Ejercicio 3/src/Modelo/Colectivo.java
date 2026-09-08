package Modelo;

import Interfaces.VehiculoDePasajeros;

public class Colectivo extends Vehiculo implements VehiculoDePasajeros {
    //Atributos
    private int cantidadPasajeros;

    //Constructor
    public Colectivo(String marca, String modelo, double velocidadMaxima, int cantidadPasajeros) {
        super(marca, modelo, velocidadMaxima);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public int obtenerCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "\nMarca: " + obtenerMarca() +
                "\nModelo: " + obtenerModelo() +
                "\nVelocidad Maxima: " + obtenerVelocidadMaxima() +
                "\nCantidad de Pasajeros: " + cantidadPasajeros;
    }
}