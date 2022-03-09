import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bowl {
    private List<Fruits> fruits;

    public Bowl(){

        fruits = new ArrayList<>();
    }

    public void addFruit(Fruits... fruit) {
        for (Fruits fruites : fruit) {
            fruits.add(fruites);
        }
    }

    public Bowl getAllApplesBowl() {
        Bowl appleBowl = new Bowl();
        for (Fruits fruit : fruits) {
            if (fruit instanceof Apple){
                appleBowl.addFruit(fruit);
            }
        }
        return appleBowl;
    }

    public Bowl getAllOrangesBowl() {
        Bowl orangeBowl = new Bowl();
        for (Fruits fruit : fruits) {
            if (fruit instanceof Apple){
                orangeBowl.addFruit(fruit);
            }
        }
        return orangeBowl;
    }

    public Bowl getAllGrapesBowls() {
        Bowl grapesBowl = new Bowl();
        for (Fruits fruit : fruits) {
            if (fruit instanceof Apple){
                grapesBowl.addFruit(fruit);
            }
        }
        return grapesBowl;
    }

    public int getCount() {
        return fruits.size();
    }
}
