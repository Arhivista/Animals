
import Animals.Bird;
import Animals.Eagle;
import Animals.Fish;

public class Main {

    public static void main(String[] args) {

        Bird myBird = new Bird();

        myBird.info();
        myBird.move();
        myBird.eat();
        
        Eagle eagle = new Eagle();
        eagle.info();
        eagle.move();
        eagle.eat();

        Fish myFish = new Fish();

        myFish.info();
        myFish.move();
        myFish.eat();

    }

}
