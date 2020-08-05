public class Animal {
    protected Bowl bowl;

    public void assignBowl(Bowl bowl) {
        this.bowl = bowl;
    }

    public void eat(int kolvo) {
        bowl.eatFood(kolvo);
    }

    public void drink(int volume) {
        bowl.drinkWater(volume);
    }
}
