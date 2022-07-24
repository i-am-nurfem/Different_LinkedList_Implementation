import java.util.Arrays;

public class ApplicationSetBasedLL {
 public static  void main(String [] args){

     IntSet listSet1 = new LinkedBasedSet();
     listSet1.add(33);
     listSet1.add(23);
     listSet1.add(14);
     listSet1.add(1);
     listSet1.add(2);
     listSet1.add(23);
     listSet1.add(18);
     listSet1.add(33);
     listSet1.add(33);
     listSet1.add(33);

     System.out.println("listSet1:" + listSet1);

     if(listSet1.contains(44))
         System.out.println("Set1 contains 44");
     else
         System.out.println("Set1 doesn't contain 44");


     IntSet listSet2 = new LinkedBasedSet();
     listSet2.add(23);
     listSet2.add(18);
     listSet2.add(33);
     listSet2.add(33);
     listSet2.add(33);

     System.out.println("listSet2:" + listSet2);

     System.out.println("Difference of two linked based sets:" + Arrays.toString(listSet1.difference(listSet2).toArray()));
     System.out.println("Intersection of two linked based sets:" + Arrays.toString(listSet1.intersection(listSet2).toArray()));
     System.out.println("Union of two linked based sets:" + Arrays.toString(listSet1.union(listSet2).toArray()));


     IntSet arraySet1 = new ArrayBasedSet();
     arraySet1.add(221);
     arraySet1.add(23);
     arraySet1.add(104);
     arraySet1.add(1);


     System.out.println("\narraySet1:" + arraySet1);


     IntSet arraySet2 = new ArrayBasedSet();
     arraySet2.add(67);
     arraySet2.add(643);
     arraySet2.add(4);
     arraySet2.add(23);


     System.out.println("arraySet2:" + arraySet2);
     System.out.println("Difference of two array based sets: " + arraySet1.difference(arraySet2));
     System.out.println("Intersection of two array based sets: " + arraySet1.intersection(arraySet2));
     System.out.println("Union of two array based sets: " + arraySet1.union(arraySet2));




 }
}

