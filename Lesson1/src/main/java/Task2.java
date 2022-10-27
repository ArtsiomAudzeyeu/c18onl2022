public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > 0) {
                count = count + 1;
            }
        }
        System.out.println("количество положительных чисел "+count);
    }
}
