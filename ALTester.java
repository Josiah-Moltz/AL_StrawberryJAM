import java.util.ArrayList;


/*

QCC
WHAT ARE "UNSAFE OPERATIONS?"
*/

/*
Note: ALTester.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
*/
public class ALTester {
  private static ArrayList<Integer> tester = new ArrayList<Integer>();

  public static void populate(ArrayList<Integer> al) {
    for (int i = 0; i < 23; i += 1) {
      al.add( (int) (23 * Math.random()) );
    }
  }

  public static void populate(OrderedArrayList oal) {
    for (int i = 0; i < 23; i += 1) {
      oal.add( (int) (23 * Math.random()) );
    }
  }

  public static boolean sorted(ArrayList<Integer> al) {
    for (int i = 0; i < al.size() - 1; i += 1) {
      if ( al.get(i) > al.get(i + 1) ) {
        return false;
      }
    }
    return true;
  }

  public static boolean sorted(OrderedArrayList oal) {
    for (int i = 0; i < oal.size() - 1; i += 1) {
      if ( oal.get(i) > oal.get(i + 1) ) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    populate();
    System.out.println(tester);
    System.out.println(sorted(tester));
    for (int i = 0; i < 23; i += 1) {
      al.set( i, i );
    }
    System.out.println(tester);
    System.out.println(sorted(tester));
    OrderedArrayList strawberry = new OrderedArrayList();
    populate(strawberry);
    System.out.println(strawberry);
    System.out.println(sorted(strawberry));


  }// end of main()
}// end of ALTester