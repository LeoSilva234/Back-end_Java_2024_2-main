package aula03.abstrato;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();

    public void horn(){
        System.out.println("Bi! " + "bi!");
        System.out.println("EU sou rei" + "tlgd");
    }
}

