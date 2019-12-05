package ua.lviv.lgs;

public class Su27 extends Plane implements DodatkitoPlane  {
    int maxSpeed;
    String color;

    public Su27(int weight, int leght, int width, int maxSpeed, String color) {
        super(weight, leght, width);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void turboAcceleration() {
        System.out.println("Acceleration is " +( Math.random()*50+maxSpeed )+ " km");
    }
    public void setMaxSpeed(){
        System.out.println("Sped is "+ this.maxSpeed);
    }

    @Override
    public void nuclearHit() {
        int hits = (int)(Math.random()*10);
        System.out.println("Plane has " + hits + " nuclearHits");

    }

    @Override
    public void stels() {
        System.out.println("Plane is not visible per " + Math.random()*100 + " s");


    }
}
