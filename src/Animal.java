public class Animal {
    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("This animal is a mammal.");
    }

    public void mate() {
        System.out.println("This animal is mating.");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.age = 5;
        myAnimal.gender = "Female";
        System.out.println("Animal's Age: " + myAnimal.age);
        System.out.println("Animal's Gender: " + myAnimal.gender);
        myAnimal.isMammal();
        myAnimal.mate();

        Fish myFish = new Fish();
        myFish.age = 2;
        myFish.gender = "Male";
        System.out.println("Fish's Age: " + myFish.age);
        System.out.println("Fish's Gender: " + myFish.gender);

        Zebra myZebra = new Zebra();
        myZebra.age = 3;
        myZebra.gender = "Female";
        myZebra.is_wild = true;
        System.out.println("Zebra's Age: " + myZebra.age);
        System.out.println("Zebra's Gender: " + myZebra.gender);
        System.out.println("Is Zebra wild?: " + myZebra.is_wild);
        myZebra.isMammal();
        myZebra.mate();
        myZebra.run();
    }
}


class Fish extends Animal {
    private int sizeInFeet;
    private void canEat() {
        System.out.println("This fish can eat.");
    }
}


class Zebra extends Animal {
    public boolean is_wild;
    public void run() {
        System.out.println("The zebra is running.");
    }
}
