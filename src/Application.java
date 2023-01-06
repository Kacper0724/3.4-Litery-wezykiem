import java.util.*;

public class Application {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        String a = "a";

        Deque<String> theDeque = new ArrayDeque<>();
        for(int i = 1; i <=50; i++) {
            String RepeatedA = a.repeat(randomGenerator.nextInt(1, 50));
            theDeque.add(RepeatedA);
        }

        EvenOddObject evenOddObject = new EvenOddObject();
        evenOddObject.EvenOddMethod(theDeque);
    }
}

class EvenOddObject {
    public void EvenOddMethod(Deque<String> EvenOddDeque) {
        List<String> EvenList = new ArrayList<>();
        List<String> OddList = new ArrayList<>();
        for (int i = 1; i <= EvenOddDeque.size(); i++) {
            String temporaryObject = EvenOddDeque.poll();
            if (temporaryObject.length() % 2 == 0) {
                EvenList.add(temporaryObject);
            } else {
                OddList.add(temporaryObject);
            }
        }
        System.out.println("Even list: " + EvenList + "\nSize: " + EvenList.size());
        System.out.println();
        System.out.println("Odd list: " + OddList + "\nSize: " + OddList.size());
    }
}