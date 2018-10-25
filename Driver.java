public class Driver{
  public static void main(String[] arg){
    SuperArray arr = new SuperArray();
    System.out.println(arr.size() + "\tsize() expected: 0");
    System.out.println(arr + "\ttoString() expected: []");
    System.out.println(arr.isEmpty() + "\tisEmpty() expected: true");
    System.out.println(arr.add("car") + "\tadd(car) expected: true");
    System.out.println(arr.size() + "\tsize() expected: 1");
    System.out.println(arr + "\ttoString() expected: [car]");
    System.out.println(arr.set(1, "pen") + "\tset(1, pen) expected: null");
    System.out.println(arr.size() + "\tsize() expected: 2");
    System.out.println(arr + "\ttoString() expected: [pen]");
    System.out.println(arr.get(0) + "\tget(0) expected: pen");
    System.out.println(arr.contains("pen") + "\tcontains(pen) expected: false");
    System.out.println(arr.contains("car") + "\tcontains(car) expected: true");
    /*
    System.out.println();
    System.out.println();*/
  }
}
