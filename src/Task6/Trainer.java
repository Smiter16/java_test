package Task6;

public class Trainer extends Human {

    public Trainer(String name) {
        super(name);
    }

    public String getName() {
        return "Trainer: " + super.getName();
    }
}
