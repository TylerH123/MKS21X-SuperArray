public class Driver{
  public static void main(String[] arg){
    SuperArray arr = new SuperArray();
    System.out.println(arr.size() + "\nsize() expected: 0");
    System.out.println(arr + "\ntoString() expected: [null, null, null, null, null, null, null, null, null, null]");
    System.out.println(arr.isEmpty() + "\nisEmpty() expected: true");
    System.out.println(arr.add("car") + "\nadd(car) expected: true");
    System.out.println(arr.size() + "\nsize() expected: 1");
    System.out.println(arr + "\ntoString() expected: [null, null, null, null, null, null, null, null, null, null, car]");
    System.out.println(arr.set(0, "pen") + "\nset(0, pen) expected: null");
    System.out.println(arr + "\ntoString() expected: [pen, null, null, null, null, null, null, null, null, null, car]");
    System.out.println(arr.get(0) + "\nget(0) expected: pen");
    /*
    System.out.println();
    System.out.println();*/
  }
}
