public class Practice {
    public static void main(String[] args) {
      DoubleList list = new DoubleList();

      list.append(22);
      list.append(7);
      list.prepend(1);

      System.out.println(list.getFirst());
      System.out.println(list.getLast());
    }
}
