package WildCodeSchool;

public class Car extends Vehicule {


    static final String MY_TYPE="une voiture";
    static final String MY_STUFF="vroum vroum";

    public Car() {
    }

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        String stuff = "Je suis " + MY_TYPE + " de marque " + getBrand()
                + " et je fait " + MY_STUFF;
        return stuff;
    }



}
