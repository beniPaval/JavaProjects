package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

        Dog myObject = new Dog();

        System.out.println("Numele catelului este " + myObject.name + " si are " + myObject.age + " luni" + " are un nivel de sanatate de " + myObject.healthLevel + " din 10 " + " un nivel de foame de " + myObject.hungerSensation + " din 10 " + "un nivel de spirit de " + myObject.spiritLevel + " din 10.") ;

       Girl girl = new Girl();
        System.out.println("Numele fetitei este " + girl.name + " si are " + girl.moneyAvailable + " lei disponibili.");

        DogFood food = new DogFood();
        System.out.println("Numele mancarii preferate a catelului este " + food.name + " si costa " + food.price + " lei.");

        Veterinarian vet = new Veterinarian();
        System.out.println("Numele veterinarului este " + vet.name + " si are specialitatea de " + vet.speciality + ".");

        Activity act = new Activity();
        System.out.println("Numele activitatii preferate a catelului este " + act.name + ".");
    }
}
