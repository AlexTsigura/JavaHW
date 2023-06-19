public class Task4 {
    public static void main(String[] args) {
        System.out.println("Задано выражение: 2? + ?5 = 47 . Восстановить выражение до верного равенства.");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (20 + i + i * 10 + 5 == 47) {
                count += 1;
                System.out.println(count + ") 2" + i + " + " + i + "5" + " = 47");
                }
            }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        }
    }
}