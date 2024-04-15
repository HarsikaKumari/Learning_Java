//abstract class
interface Animal {
    // abstract method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// pig "implements" the animal interface
class pig implements Animal {
    public void animalSound() {
        // the body of animal sound is provided here
        System.out.println("The pig says: Wee Wee");
    }

    public void sleep() {
        // the body of sleep() is provided here
        System.out.println("Zzzz");
    }
}

class Animals {
    public static void main(String[] args) {
        pig myPig = new pig(); // Create a pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
