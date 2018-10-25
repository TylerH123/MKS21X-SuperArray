public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int len){
    data = new String[len];
    size = 0;
  }
  public void clear(){
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if (size == 0) return true;
    else{
      return false;
    }
  }
  public boolean add(String s){
    if (size == data.length)resize();
    data[size] = s;
    size++;
    return true;
  }
  private void resize(){
    String[] newArr = new String[data.length + 1];
    data = newArr;
  }
  public String toString(){
    String output = "";
    if (size == 0) return "[]";
    for (int i = 0; i < size-1 ; i++){
      output += data[i] + ", ";
    }
    output += data[size-1];
    return "[" + output + "]";
  }
  public String get(int index){
    if (index < 0 || index >= size())return null;
    return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size) return null;
    String old = data[index];
    data[index] = element;
    return old;
  }
  public boolean contains(String target){
    for (int i = 0; i < size; i++){
      if (data[i].equals(target)){
        return true;
      }
    }
    return false;
  }
  public int indexOf(String target){
    for (int i = 0; i < size; i++){
      if (data[i].equals(target)) return i;
    }
    return -1;
  }
}
