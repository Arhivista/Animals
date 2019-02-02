package Animals;

public class Fish extends Animal {

    public String waterType = "Sea";

    @Override
    public void move() {
        System.out.println("Riba pliva"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        System.out.println("Riba jede morsku travu"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void info() {

        System.out.println("WaterType: " + this.waterType);

    }
}
