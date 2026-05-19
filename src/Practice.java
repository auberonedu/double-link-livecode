public class Practice {
    public static void main(String[] args) {
      DoubleList list = new DoubleList();
      list.append(1);
      list.append(2);
      list.prepend(0);
      System.out.println(list.getFirst());
      System.out.println(list.getLast());
      System.out.println(list);
    }
}

