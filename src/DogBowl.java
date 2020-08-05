class DogBowl extends Bowl {
    private int water;

    public void setWater(int water) { //добавить воды
        this.water += water;
    }

    public int getWater() {
        return water;
    }

    @Override
    public void drinkWater(int volume) {
        water -= volume;
    }
}
