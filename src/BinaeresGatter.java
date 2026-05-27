

public abstract class BinaeresGatter implements Gatter {
    protected final Gatter eingang1;
    protected final Gatter eingang2;

    public BinaeresGatter(Gatter eingang1, Gatter eingang2) {
        this.eingang1 = eingang1;
        this.eingang2 = eingang2;
    }

    @Override
    public abstract boolean getOutput();
}