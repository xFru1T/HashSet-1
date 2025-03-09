import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        System.out.print("Print size array: ");
        int size = scanner.nextInt();
        int[] num = new int[size];
        System.out.print("Print " + size + " num(s): ");
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
            numbers.add(num[i]);
        }
        System.out.print("Print num for search in string: ");
        int s1 = scanner.nextInt();
        boolean res = numbers.contains(s1);
        System.out.println(res);
    }
}
