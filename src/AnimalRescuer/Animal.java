package AnimalRescuer;

public class Animal {

    private String name = "Miti";
    private int age = 2;
    private int healthLevel = 3;
    private int hungerSensation = 5;
    private int spiritLevel = 2;
    private String foodName = "hrana umeda pentru caini junior";
    private String activity = "sa aduca mingea";

    public void eat() {
        System.out.println("Eating..");
    }

    public void run() {
        System.out.println("running..");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerSensation() {
        return hungerSensation;
    }

    public void setHungerSensation(int hungerSensation) {
        this.hungerSensation = hungerSensation;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("ZzzZZzz..");
    }


}
