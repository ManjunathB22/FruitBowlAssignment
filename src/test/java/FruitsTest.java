import org.testng.Assert;
import org.testng.annotations.Test;

import javax.management.remote.rmi.RMIJRMPServerImpl;

public class FruitsTest {

    @Test
    public void segregateFruits(){
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Grapes grapes1 = new Grapes();
        Grapes grapes2 = new Grapes();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();


        Bowl mixedFruitBowl = new Bowl();

        //Adding fruits to bowl
        mixedFruitBowl.addFruit(apple1, apple2,orange1,orange2,grapes1,grapes2);

        Bowl bowlOfApples = mixedFruitBowl.getAllApplesBowl();
        Bowl bowlOfOranges = mixedFruitBowl.getAllOrangesBowl();
        Bowl bowlOfGrapes = mixedFruitBowl.getAllGrapesBowls();

        //Get count of Fruits
        Assert.assertEquals(bowlOfApples.getCount(),2);
        Assert.assertEquals(bowlOfOranges.getCount(),2);
        Assert.assertEquals(bowlOfGrapes.getCount(),2);
    }
}
