package adapter;
class BirdAdapter implements Bird {
    ToyDuck toyDuck;

    public BirdAdapter(ToyDuck toyDuck) {
        this.toyDuck = toyDuck;
    }

    @Override
    public void makeSound() {
        toyDuck.squeak();
    }
}
