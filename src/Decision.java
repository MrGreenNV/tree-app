/**
 * @author mrGreenNV
 */
public abstract class Decision<T extends IEntity> {
    public abstract void Evaluate(T t);
}
