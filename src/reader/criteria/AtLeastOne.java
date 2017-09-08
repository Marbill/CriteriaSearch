package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion {

    List<Criterion> argumentsList;

    public AtLeastOne(Criterion... params) {
        this.argumentsList = new ArrayList<Criterion>();

        for (Criterion param : params) {
            this.argumentsList.add(param);
        }
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criterion : argumentsList) {
            if (criterion.complies(line)) {
                return criterion.complies(line);
            }
        }

        return false;
    }

}
