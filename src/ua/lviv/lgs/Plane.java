package ua.lviv.lgs;

public abstract class Plane {
    int weight;
    int leght;
    int width;
    ControlPlane plane = new ControlPlane();

    public Plane(int weight, int leght, int width) {
        this.weight = weight;
        this.leght = leght;
        this.width = width;
    }

    public void startEngine() {
        System.out.println("Time for startEngine is " + Math.random() * (88 - 20) + 20);
    }

    public void vzlot() {
        System.out.println("Vzlot is " + Math.random() * 1000);
    }

    public void posadka() {
        System.out.println("Litak ide na posadku ");
    }

    public void moveUp() {
        plane.moveUp();
    }



    public void moveLeft() {
        plane.moveLeft();
    }



    public void moveDown() {
        plane.moveDown();
    }



    public void moveRight() {
        plane.moveRight();
    }




}
