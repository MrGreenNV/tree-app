/**
 * @author mrGreenNV
 */
public class DecisionResult<T extends IEntity> extends Decision<T> {

    public final Object res;
    public DecisionResult(Object b) {
        this.res = b;
    }

    @Override
    public void Evaluate(T t) {
        // TODO Здесь реализовать UI!!
        System.out.println("Результат: " + res.toString());
    }
}
