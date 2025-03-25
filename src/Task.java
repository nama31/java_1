import java.util.*;
import java.util.function.BiFunction;

public class Task {
    public static void main(String[] args) {


        Matimatican add = (a,b) -> System.out.println(a+b);
        add.to(3,5);

        Matimatican subtraction = (a,b) -> System.out.println(a-b);
        subtraction.to(3,5);

        Matimatican multiply = (x,y) -> System.out.println(x*y);
        multiply.to(3,5);

        Matimatican division = (t,r) -> {
            double c = t/r ;
            System.out.println(c);

        };

        division.to(3,5);

        ArrayList<Integer> odd = new ArrayList<Integer>(Arrays.asList(10,13,15,14,16));

        Iter toOdd = ()->{
            for(int i = 0;i < odd.size();i++){
                if(odd.get(i) %2 ==0){
                    odd.remove(i);
                }
            }
            System.out.println(odd);

        };

        toOdd.chek();

        ArrayList<String> namas = new ArrayList<String>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        Iter sor = () -> {
            Collections.sort(namas);
            Collections.reverse(namas);
            System.out.println(namas);
        };

        sor.chek();




        Iter uperRevers = () ->{
            for(int i = 0; i<namas.size();i++){
                StringBuilder a = new StringBuilder(namas.get(i));
                String reversedUpper = a.reverse().toString().toUpperCase(); // Reverse and convert to uppercase
                namas.set(i, reversedUpper); // Update the list element

            }
            System.out.println(namas);
        };

        uperRevers.chek();


        namas.forEach(s ->System.out.println("the element:"+s));

        for(String s : namas){
            System.out.println("the element" + s);
        }

        BiFunction<Integer,Integer,Integer> compara = (a,b) -> {
            if(a.compareTo(b) >0){
                return a;
            }
            return b;

        };
        System.out.println(compara.apply(3,4));



    }
}

interface Matimatican {
    void to(int a, int b);
}

interface Iter {
    public  void chek();
}

