package Task7;

public class Cow extends Animal{

    public Cow(String voice) {
        super(voice);
    }
    @Override
    public String getVoice() {
        return (super.getVoice() + " Muu!");
    }
}
