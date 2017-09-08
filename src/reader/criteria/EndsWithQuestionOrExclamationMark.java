package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {
        if (line.endsWith("?")) {
            return line.endsWith("?");
        } else if (line.endsWith("!")) {
            return line.endsWith("!");
        } else {
            return false;
        }
    }

}
