
package Animals;


public class Bird extends Animal {
    
    public String reproduction = "egg";
    public String outerCovering = "feather";

    @Override
    public void move() {
        System.out.println("Ptica leti"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        System.out.println("Ptica kljuca."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override 
    public void info(){
        super.info();
        System.out.println("Reproduction: " + this.reproduction);
        System.out.println("outer Covering: " + this.outerCovering);
    }
    
}
