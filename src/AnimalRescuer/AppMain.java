package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

        Dog myObject = new Dog();

        System.out.println("Numele catelului este " + myObject.name + " si are " + myObject.age + " luni.");

       Girl girl = new Girl();
        System.out.println("Numele fetitei este " + girl.name + " si are " + girl.moneyAvailable + " lei disponibili.");

        DogFood food = new DogFood();
        System.out.println("Numele mancarii preferate a catelului este " + food.name + " si costa " + food.price + " lei.");

        Veterinarian vet = new Veterinarian();
        System.out.println("Numele veterinarului este " + vet.name + " si are specialitatea de " + vet.speciality + ".");
    }
}
