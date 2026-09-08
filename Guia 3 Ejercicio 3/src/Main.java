import Modelo.*;

void main() {

        Automovil auto1 = new Automovil("Ford", "Fiesta", 150.0, 5);
        Colectivo colectivo1 = new Colectivo("Mercedes", "Marcopolo", 120.0, 50);
        Camion camion1 = new Camion("Scania", "C112", 120.0, 2500.0);
        Bicicleta bici1 = new Bicicleta("Venzo", "Raptor", 65.5);

        System.out.println(auto1);
        System.out.println(colectivo1);
        System.out.println(camion1);
        System.out.println(bici1);
}