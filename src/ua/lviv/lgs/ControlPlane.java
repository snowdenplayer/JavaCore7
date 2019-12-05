package ua.lviv.lgs;

public class ControlPlane {

    public void moveUp(){
        System.out.println("Plane moving up " + Math.random()*100+" km");
    }
    public void moveDown(){
        System.out.println("Plane moving down " + Math.random()*100+" km");
    }
    public void moveLeft(){
        System.out.println("Plane moving left " + Math.random()*100+" km");
    }
    public void moveRight(){
        System.out.println("Plane moving right " + Math.random()*100+" km");
    }
}
