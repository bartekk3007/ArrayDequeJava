import java.util.ArrayDeque;

public class Main
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(10);
        arrayDeque.add(2);
        arrayDeque.add(4);
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.peek());
    }
}