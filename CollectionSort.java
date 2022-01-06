import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSort {
    public static void main(String[] args){

        ArrayList<Learner> arrLearner = new ArrayList<Learner>();
        arrLearner.add(new Learner(1003,"Pedro","Mexico"));
        arrLearner.add(new Learner(1001,"Peter", "USA"));
        arrLearner.add(new Learner(1002,"Francois","France"));

        // Prints without sorting
        for (Learner learner:arrLearner){
            System.out.println(learner.toString());
        }

        // Prints sorted array
        Collections.sort(arrLearner,new SortLearner());
        for (Learner learner:arrLearner){
            System.out.println(learner.toString());
        }
    }

}

class Learner{

    int id;
    String name;
    String location;

    public Learner(int id, String name, String location){
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString(){
        return this.id + " " +this.name + " " + this.location;
    }
}

class SortLearner implements Comparator <Learner>{
    public int compare(Learner a, Learner b){
        return a.id - b.id;
    }
}
