

public class BinaeresGatterUnd extends BinaeresGatter {
    public BinaeresGatterUnd(Gatter eingang1, Gatter eingang2) {
        super(eingang1, eingang2);
    }

    @Override
    public boolean getOutput() {
        return eingang1.getOutput() && eingang2.getOutput();
    }

    @Override
    public String toString() {
        return "(" + eingang1.toString() + " UND " + eingang2.toString() + ")";
    }
}