public class Driver{
  public static void main(String[] arg){
    SuperArray arr = new SuperArray();
    System.out.println(arr.size() + "\tsize() expected: 0");
    System.out.println(arr + "\ttoString() expected: []");
    System.out.println(arr.isEmpty() + "\tisEmpty() expected: true");
    System.out.println(arr.add("car") + "\tadd(car) expected: true");
    System.out.println(arr.size() + "\tsize() expected: 1");
    System.out.println(arr + "\ttoString() expected: [car]");
    System.out.println(arr.set(0, "pen") + "\tset(0, pen) expected: car");
    System.out.println(arr + "\ttoString() expected: [pen]");
    System.out.println(arr.get(0) + "\tget(0) expected: pen");
    System.out.println(arr.contains("pen" + "\tcontains(pen) expected: false"));
    /*
    System.out.println();
    System.out.println();*/
  }
}
