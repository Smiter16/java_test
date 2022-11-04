package Task7;

public class Cat extends Animal {

    public Cat(String voice) {
        super(voice);
    }

    @Override
    public String getVoice() {
        return  (super.getVoice() + " Meaw!");
    }
}