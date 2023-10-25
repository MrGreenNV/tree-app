import java.util.function.Function;

/**
 * @author mrGreenNV
 */
public class DecisionQuery<T extends IEntity> extends Decision<T> {

    private String title;
    private Decision positive;
    private Decision negative;
    private Function<T, Boolean> test;

    public DecisionQuery(String title, Decision positive, Decision negative, Function<T, Boolean> test) {
        this.title = title;
        this.positive = positive;
        this.negative = negative;
        this.test = test;
    }

    @Override
    public void Evaluate(IEntity entity) {
        T t = (T) entity;
        if (test.apply(t)) {
            positive.Evaluate(t);
        } else {
            negative.Evaluate(t);
        }
    }
}
