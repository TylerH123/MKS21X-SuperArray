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
    resize();
    data[data.length-1] = s;
    size++;
    return true;
  }
  private void resize(){
    String[] newArr = new String[data.length + 1];
  }
  public String toString(){
    String output = "";
    for (int i = 0; i < data.length -1; i++){
      output += data[i] + ", ";
    }
    output += data[data.length-1];
    return "[" + output + "]";
  }
  public String get(int index){
    if (index < 0 || index >= size())return null;
    return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size()) return null;
    String old = data[index];
    data[index] = element;
    return old;
  }
  public boolean contains(String target){
    for (int i = 0; i < data.length; i++){
      if (data[i].equals(target)){
        return true;
      }
    }
    return false;
  }
}
