public abstract class Bowl {
    private int food;

    public void setFood(int food) { //добавить еды
        this.food += food;
    }

    public int getFood() {
        return food;
    }

    public void eatFood(int kolvo) {
        if (kolvo > food) {
            System.out.println("Не хватает еды в миске");
        } else {
            food -= kolvo;
        }
    }

    public abstract void drinkWater(int volume);
}
