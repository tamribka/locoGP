package locoGP.problems;
public class Sort1SelectionProblem132 {
  public static Integer[] sort(  Integer[] a,  Integer length){
    for (int currentPlace=0; currentPlace < length - 1; currentPlace++) {
      int smallest=a[currentPlace];//Integer.MAX_VALUE; //max replaced - 28423
      int smallestAt=currentPlace +1;
      for (int check=currentPlace; check < length; check++) {
        if (a[check] < smallest) {
          smallestAt=check;
          smallest=a[check];
        }
      }
      int temp=a[currentPlace];
      a[currentPlace]=a[smallestAt]; // this is needed!
      a[smallestAt]=temp;
    }
    return a;
  }
}

