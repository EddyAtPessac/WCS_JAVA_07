package WildCodeSchool;

public class Boat extends Vehicule {


    static final String MY_TYPE="un bateau";
    static final String MY_STUFF="glou glou";

    public Boat(String brand) {
        super(brand, 0);
    }

    @Override
    public String doStuff() {
        String stuff = "Je suis " + MY_TYPE + " de marque " + getBrand()
                + " et je fait " + MY_STUFF;
        return stuff;
    }

}
