package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreateAggregate extends Aggregate {

    @Override
    Iterator createIterator() {
        return new ConcreateIterator(this);
    }

    private List<Object> items = new ArrayList<Object>();

    int count(){
        return items.size();
    }

    Object value(int index){
        return items.get(index);
    }

   void add(String s){
        items.add(s);
   }



}
