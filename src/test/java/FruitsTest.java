import com.ultralesson.objectorientation.Apple;
import com.ultralesson.objectorientation.Bowl;
import com.ultralesson.objectorientation.Grapes;
import com.ultralesson.objectorientation.Orange;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitsTest {

    @Test
    public void getAllTypesOfFruits(){
        Apple apple1 = new Apple("Red", "Medium", "Sweet");
        Apple apple2 = new Apple("Green", "Small", "Sour");
        Grapes grapes1 = new Grapes("Green", "Small","Sour" );
        Grapes grapes2 = new Grapes("Red","Small", "Sweet");
        Orange orange1 = new Orange("Orange", "Medium", "Sweet");
        Orange orange2 = new Orange("Red", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();

        mixedFruitBowl.addFruit(apple1, apple2,orange1,orange2,grapes1,grapes2);

        Bowl bowlOfApples = mixedFruitBowl.getAllApplesBowl();
        Bowl bowlOfOranges = mixedFruitBowl.getAllOrangesBowl();
        Bowl bowlOfGrapes = mixedFruitBowl.getAllGrapesBowls();

        //Get count of Fruits
        Assert.assertEquals(bowlOfApples.getCount(),2);
        Assert.assertEquals(bowlOfOranges.getCount(),2);
        Assert.assertEquals(bowlOfGrapes.getCount(),2);
    }

    @Test
    public void getFruitsBasedOnColor(){
        Apple apple1 = new Apple("Red", "Medium", "Sweet");
        Apple apple2 = new Apple("Green", "Small", "Sour");
        Grapes grapes1 = new Grapes("Green", "Small","Sour" );
        Grapes grapes2 = new Grapes("Red","Small", "Sweet");
        Orange orange1 = new Orange("Orange", "Medium", "Sweet");
        Orange orange2 = new Orange("Red", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();

        mixedFruitBowl.addFruit(apple1, apple2,orange1,orange2,grapes1,grapes2);

        Bowl bowlOfGreenFruits = mixedFruitBowl.getAllGreenColorFruits();
        Bowl bowlOfOrangeFruits = mixedFruitBowl.getAllOrangeColorFruits();
        Bowl bowlOfRedFruits = mixedFruitBowl.getAllRedColorFruits();

        //Get count of Fruits
        Assert.assertEquals(bowlOfGreenFruits.getCount(),2);
        Assert.assertEquals(bowlOfOrangeFruits.getCount(),1);
        Assert.assertEquals(bowlOfRedFruits.getCount(),3);
    }


    @Test
    public void getFruitsBasedOnSize(){
        Apple apple1 = new Apple("Red", "Medium", "Sweet");
        Apple apple2 = new Apple("Green", "Small", "Sour");
        Grapes grapes1 = new Grapes("Green", "Small","Sour" );
        Grapes grapes2 = new Grapes("Red","Medium", "Sweet");
        Orange orange1 = new Orange("Orange", "Medium", "Sweet");
        Orange orange2 = new Orange("Red", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();

        mixedFruitBowl.addFruit(apple1, apple2,orange1,orange2,grapes1,grapes2);

        Bowl bowlOfMediumSizeFruits = mixedFruitBowl.getAllMediumSizeFruits();
        Bowl bowlOfSmallSizeFruits = mixedFruitBowl.getAllSmallSizeFruits();

        //Get count of Fruits
        Assert.assertEquals(bowlOfMediumSizeFruits.getCount(),4);
        Assert.assertEquals(bowlOfSmallSizeFruits.getCount(),2);
    }

    @Test
    public void getFruitsBasedOnType(){
        Apple apple1 = new Apple("Red", "Medium", "Sweet");
        Apple apple2 = new Apple("Green", "Small", "Sweet");
        Grapes grapes1 = new Grapes("Green", "Small","Sour" );
        Grapes grapes2 = new Grapes("Red","Medium", "Sweet");
        Orange orange1 = new Orange("Orange", "Medium", "Sweet");
        Orange orange2 = new Orange("Red", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();

        mixedFruitBowl.addFruit(apple1, apple2,orange1,orange2,grapes1,grapes2);

        Bowl bowlOfSourTypeFruits = mixedFruitBowl.getAllSourTypeFruits();
        Bowl bowlOfSweetTypeFruits = mixedFruitBowl.getAllSweetTypeFruits();


        Assert.assertEquals(bowlOfSourTypeFruits.getCount(),2);
        Assert.assertEquals(bowlOfSweetTypeFruits.getCount(),4);
    }

}
