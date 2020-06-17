package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

        Animal myObject = new Animal();

        System.out.println("Numele catelului este " + myObject.getName()+ " si are " + myObject.getAge() + " luni" + " are un nivel de sanatate de " + myObject.getHealthLevel() + " din 10 " + " un nivel de foame de " + myObject.getHungerSensation() + " din 10 " + "un nivel de spirit de " + myObject.getSpiritLevel() + " din 10.") ;

       Girl girl = new Girl();
        System.out.println("Numele fetitei este " + girl.getName() + " si are " + girl.getMoneyAvailable() + " lei disponibili.");

        Food food = new Food();
        System.out.println("Numele mancarii preferate a catelului este " + food.getName() + " si costa " + food.getPrice() + " lei.");

        Veterinarian vet = new Veterinarian();
        System.out.println("Numele veterinarului este " + vet.getName() + " si are specialitatea de " + vet.getSpeciality() + ".");

        Activity act = new Activity();
        System.out.println("Numele activitatii preferate a catelului este " + act.getName()+ ".");
    }
}
