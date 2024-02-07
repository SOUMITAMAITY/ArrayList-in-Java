import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
   public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<String> list2 = new ArrayList<String>();
       ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      
       //add elements
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);

       // get element
       int element=list.get(2);
       System.out.println(element);

       //Add Element at a specific Index

       list.add(1,2);
       System.out.println(list);

       //Set Element at a specific Index
       list.set(2,6);
       System.out.println(list);

       //Delete Element from an Index
       list.remove(1);
       System.out.println(list);

       //Size of the List
       int size = list.size();
       System.out.println(size);

       //Loop/Iterate on the List
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
       }
       System.out.println();

       //Sort the List
       Collections.sort(list);
       System.out.println(list);
   }
}
