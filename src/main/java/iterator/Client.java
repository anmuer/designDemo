package iterator;

public class Client {

    public static void main(String[] args){
        ConcreateAggregate listAggregate = new ConcreateAggregate();
        listAggregate.add("one");
        listAggregate.add("two");
        listAggregate.add("three");
        listAggregate.add("four");
        listAggregate.add("five");

        Iterator i = new ConcreateIterator(listAggregate);
        Object item = i.first();
        System.out.println(item);

        while(!i.isDone()){
            System.out.println(i.currentItem());
            i.next();
        }
    }
}
