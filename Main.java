import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      System.out.println(parsedI);

      Integer fancyInt = new Integer(13);
      Double fancyDoub = new Double(4.00);

      Integer fancierInt = 13;

      int regularInt = fancierInt;

      System.out.println();
      System.out.println();

      // 4.8 ARRAYLIST
      /* ArrayList is a RE-SIZABLE collection
         You can ADD or REMOVE items from lists!
         ArrayList is MUTABLE(can change during run)      
      */

      // ArrayList<Type> name = new ArrayList<Type>();

      ArrayList<String> toDo = new ArrayList<String>();
      // For numbers, must use WRAPPER classes (not primitaves!)
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doubList = new ArrayList<Double>();

      // ARRAYLIST METHODS (assume "list" is an ArrayList)

      // list.size() returns an int
      // counts the number of items in the list
      int numTasks = toDo.size();
      System.out.println("Number of items on To Do list:" + numTasks);

      // list.add( obj ) appends the obj to end of list
      // returns a boolean, but that's not important 
      toDo.add( "Buy cat food" );
      toDo.add( "FINISH HOMEWORK" );
      toDo.add( " Call mom" );
      // check size after adding stuff
      System.out.println( "Number of items after adding: " + toDo.size() );
      System.out.println( toDo ); // ArrayList has a nice toString method!!!

      // list.add( index, obj ) inserts the obj
      // AT a specific INDEX! (position)
      toDo.add( 1, "Grade homework" );
      System.out.println( toDo ); 
      // REMEMBER that indexes start at 0
      // so 1 means we added to the SECOND spot

   }
}
