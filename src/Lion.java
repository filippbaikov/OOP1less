import java.time.LocalDate;

public class Lion extends Animal {
    public Lion(float weight, float height, LocalDate age,  String name, Owner owner) {
        super(weight, height, age, name, owner);
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public float getHeight() {
        return super.getHeight();
    }

    @Override
    public LocalDate getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Owner getOwner() {
        return super.getOwner();
    }

    @Override
    public void lifeCycle() {
        super.lifeCycle();
    }
    public void moving() {
        super.moving("walk");
    }
}


