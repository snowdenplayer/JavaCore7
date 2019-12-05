package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {
        Su27 c=new Su27(10,10,10000,1000,"White");
        c.startEngine();
        c.vzlot();
        c.moveUp();
        c.moveDown();
        c.moveLeft();
        c.moveRight();
        c.stels();
        c.nuclearHit();
        c.turboAcceleration();
        c.posadka();
        c.setMaxSpeed();
    }
}
