package iterator;

public class ConcreateIterator extends Iterator {

    private ConcreateAggregate concreateAggregate;
    private int current;

    ConcreateIterator(ConcreateAggregate concreateAggregate){
        this.concreateAggregate = concreateAggregate;
    }

    Object first() {
        return concreateAggregate.value(0);
    }

    Object next() {
        Object ret = null;
        current++;
        if(current<concreateAggregate.count()){
            ret = concreateAggregate.value(current);
        }
        return ret;
    }

    Boolean isDone() {
        return current >= concreateAggregate.count();
    }

    Object currentItem() {
        return concreateAggregate.value(current);
    }
}
