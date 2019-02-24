package LearningJava;

public class EUString {

    private String dec;

    public EUString(String dec) {
        this.dec = dec;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec =  dec;
    }

    @Override
    public String toString() {
        return "Declaration of the EU\n" + dec;
    }
}
