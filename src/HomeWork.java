public class HomeWork {

    public static void main(String[] args) {
        Animal kitty = new Cat();
        Bowl bowlForKitty = new CatBowl();
        kitty.assignBowl(bowlForKitty);

        bowlForKitty.setFood(15);
        kitty.eat(100);
        System.out.println("Осталось еды в миске: " + bowlForKitty.getFood());
        kitty.drink(19);

        System.out.println();

        Animal puppy = new Dog();
        DogBowl bowlForPuppy = new DogBowl();
        puppy.assignBowl(bowlForPuppy);

        bowlForPuppy.setFood(20);
        puppy.eat(14);
        System.out.println("Осталось еды в миске: " + bowlForPuppy.getFood());
        bowlForPuppy.setWater(25);
        puppy.drink(10);
        System.out.println("Осталось воды в миске: " + bowlForPuppy.getWater());
    }
}
