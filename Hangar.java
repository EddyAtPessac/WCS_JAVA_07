package WildCodeSchool;

import java.util.ArrayList;

public class Hangar {


    public static void main(String[] args) {
        int idx=0;

        ArrayList vehicules = new ArrayList();
        vehicules.add(idx++, new Car("Renault", 107000));
        vehicules.add(idx++, new Boat("Petit bateau"));
        vehicules.add(idx++, new Car("BMW", 400102));
        vehicules.add(idx++, new Boat("Petit navire"));
        vehicules.add(idx++, new Car("Pigeot", 56000));

        // On boucle sur les elements de la liste
        for (Object objVehicule : vehicules) {
            Vehicule vehicule= (Vehicule) objVehicule; // Recupere la classe de base
            System.out.println(vehicule.doStuff());
        } // for vehicule
    }

}
