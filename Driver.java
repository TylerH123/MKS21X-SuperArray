public class Driver{
  public static void main(String[] arg){
    SuperArray arr = new SuperArray();
    System.out.println(arr.size() + "\tsize() expected: 0");
    System.out.println(arr + "\ttoString() expected: []");
    System.out.println(arr.isEmpty() + "\tisEmpty() expected: true");
    System.out.println(arr.add("car") + "\tadd(car) expected: true");
    System.out.println(arr.size() + "\tsize() expected: 1");
    System.out.println(arr + "\ttoString() expected: [car]");
    System.out.println(arr.set(1, "pen") + "\tset(1, pen) expected: error");
    System.out.println(arr.size() + "\tsize() expected: 1");
    System.out.println(arr + "\ttoString() expected: [car]");
    System.out.println(arr.get(0) + "\tget(0) expected: car");
    System.out.println(arr.contains("pen") + "\tcontains(pen) expected: false");
    System.out.println(arr.contains("car") + "\tcontains(car) expected: true");
    arr.add("chicken");
    arr.add("2");
    arr.add("coffee");
    arr.add("apple");
    arr.add("phone");
    arr.add("test");
    arr.add("coffee");
    System.out.println(arr.indexOf("2") + "\tindexOf(2) expected: 2");
    System.out.println(arr.lastIndex("coffee") + "\tlastIndex(coffee) expected: 7");
    System.out.println(arr.set(1, "pen") + "\tset(1, pen) expected: chicken");
    System.out.println(arr + "\ttoString() expected: [car, pen, 2, coffee, apple, phone, test, coffee]");
    arr.add(2,"water");
    System.out.println(arr + "\ttoString() expected: [car, pen, water, 2, coffe, apple, phone, test, coffee]");
    System.out.println(arr.size() + "\tsize() expected: 9");
    System.out.println(arr.remove(2) + "\tremove(2) expected: water");
    System.out.println(arr + "\ttoString() expected: [car, pen, 2, coffe, apple, phone, test, coffee]");
    System.out.println(arr.size() + "\tsize() expected: 7");
    /*
    System.out.println();*/
  }
}
