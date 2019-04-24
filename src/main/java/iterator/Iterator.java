package iterator;

public abstract class Iterator {

    abstract Object first();
    abstract Object next();
    abstract Boolean isDone();
    abstract Object currentItem();

}
