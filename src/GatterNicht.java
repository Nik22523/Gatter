

public class GatterNicht implements Gatter {
    private final Gatter eingang;

    public GatterNicht(Gatter eingang) {
        this.eingang = eingang;
    }

    @Override
    public boolean getOutput() {
        return !eingang.getOutput();
    }

    @Override
    public String toString() {
        return "(NICHT " + eingang.toString() + ")";
    }
}
