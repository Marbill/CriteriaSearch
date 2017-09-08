package reader.criteria;

public class Not implements Criterion {

    private Criterion c;

    public Not(Criterion c) {
        this.c = c;
    }

    @Override
    public boolean complies(String line) {
        if (c.complies(line) == false) {
            return true;
        } else {
            return false;
        }

    }
}
