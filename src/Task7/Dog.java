package Task7;

public class Dog extends Animal{

    public Dog(String voice) {
        super(voice);
    }
    @Override
    public String getVoice() {
        return (super.getVoice() + " Gaw!");
    }
}
