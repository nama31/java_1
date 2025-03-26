import com.sun.source.tree.Tree;

import java.util.*;

public class Midterm {
    public static void main(String[] args) {

        // ArrayList tasks
        ArrayList<Integer> my = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,89));
        my.forEach(m -> {
                System.out.println("yyyy hyyyy");

        });
        ArrayList<Integer> your = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,89));
        System.out.println(compair(my,your));

        printer(my);

        // linked lists tasks
        LinkedList<Integer> ex2 = new LinkedList<Integer>(Arrays.asList(1,2,3,45,6,7,8,9,12));
        System.out.println(ex2.get(2));
        my.set(2,100);
        System.out.println(ex2.get(2));
        ex2.forEach(m -> System.out.println(m));


        System.out.println(ex2);
        System.out.println(shuffle(ex2));

        LinkedList<Integer> ex3 = new LinkedList<Integer>(Arrays.asList(2,3,5,12,4,12,3,4,5));

        System.out.println(compair(ex2,ex3));

        int first = ex3.getFirst();

        // hash set tasks
        HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(1,2,3,5,2,6,8,34,6));
        hs.add(2);
        System.out.println(hs);
        ArrayList<Integer> lop = new ArrayList<Integer>();
        hs.forEach(n ->{
            lop.add(n);
        });
        System.out.println(lop);
        System.out.println(hs.retainAll(hs));
        hs.clear();

        // tree set tasks

        TreeSet<Integer> id = new TreeSet<Integer>(Arrays.asList(1,8));
        TreeSet<Integer> Id = id;
        TreeSet<Integer> iD = (TreeSet<Integer>) id.clone();

        id.forEach(m -> {
            if(m>7){
                System.out.println(m);
            }
        });

        Run chek = (s ,i) -> {
            s.forEach(m ->{
                if(m >= i){
                    System.out.println(m);
                }
            });
        };
        chek.go(id,2);

        uborka(id,1);

        // prioryti queue tasks

        PriorityQueue<Integer> uniq = new PriorityQueue<Integer>(Arrays.asList(15,1,8,34,2));
        uniq.add(3);
        System.out.println(uniq );
        System.out.println(uniq.size());
        PriorityQueue<Integer> qoni = new PriorityQueue<>(Comparator.reverseOrder());
        qoni.addAll(uniq);
        System.out.println(qoni);
        Not cheking = () -> {
            uniq.forEach(m -> {
                if(qoni.contains(m)) System.out.println(m);
            });
        };

        cheking.to();

        ArrayList<Integer> mini = new ArrayList<Integer>(uniq);

        // hash map tasks
        HashMap<Integer,String> pupu = new HashMap<Integer,String>();
        pupu.put(1,"aman");
        pupu.put(2,"nama");

        for(HashMap.Entry<Integer,String> e : pupu.entrySet()){
            System.out.println(e.getKey()+e.getValue());
        }

        Yes uni = (s) -> {
            for(Map.Entry<Integer,String> e : pupu.entrySet() ){
                if (e.getValue() == s){
                    System.out.println( "Yes");
                }
            }
        };
        uni.todo("nama");

        Yes che = (s) -> {
            for(Map.Entry<Integer,String> e : pupu.entrySet()){
                if(s == e.getValue()){
                    System.out.println(e.getKey());
                }
            }
        };

        che.todo("nama");

        System.out.println(pupu);


        TreeMap<Integer,String> upup = new TreeMap<Integer,String>();
        upup.put(1,"aman");
        upup.put(2,"nama");
        upup.put(3,"kora");
        System.out.println(upup.firstKey() + upup.lastKey());

        System.out.println(upup.get(upup.lastKey()));

        Idea pot = (t) -> {
            for(Map.Entry<Integer,String> e : upup.entrySet()){
                if(e.getKey() >t){
                    System.out.println(e);
                }
            }
        };

        pot.no(2);


    }
    public static boolean compair(List<Integer> a , List<Integer> b){
        if (a.size() != b.size()){
            return false;
        }
        for(int i = 0; i<a.size();i++){
            if (a.get(i) != b.get(i)){
                return false;
            }
        }
        return true;
    }

    public static void printer(ArrayList<Integer> m){
        for(int i = 0;i<m.size();i++){
            System.out.println("the element intex:"+i+""+"the elemet:"+m.get(i));
        }
    }
    public static LinkedList<Integer> shuffle(LinkedList<Integer> a){
        int end = a.size();
        for (int i =0;i<end;i++){
            Random rand = new Random();
            int net = rand.nextInt(end);
            int du = a.get(i);
            int pred = a.get(net);
            a.set(i,pred);
            a.set(net,du);
        }
        return a;
    }

    public static void uborka(TreeSet<Integer> e , int target){
        e.remove(target);
    }


}


interface Run{
    void go(TreeSet<Integer> s ,int target);
}
interface Not{
    void to();
}
interface Yes{
    void todo(String target);
}

interface Idea{
    void no(int t);
}



/*
* links
* https://www.geeksforgeeks.org/generating-random-numbers-in-java/
*https://www.geeksforgeeks.org/difference-between-hashmap-and-hashset/
* https://www.geeksforgeeks.org/treeset-in-java-with-examples/
* https://www.geeksforgeeks.org/map-interface-java-examples/
* https://www.geeksforgeeks.org/iterate-map-java/
*
* */