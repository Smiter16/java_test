package Task6;

public class Driver extends Human {

    public Driver(String name) {
        super(name);
    }
    @Override
    public String getName () {
        return "Driver : " +  super.getName();
    }
}
