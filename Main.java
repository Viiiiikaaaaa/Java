public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Массив из чисел");
        for (int i = 0; i < array.length; i++) {
            int n = 100;
            array[i] = (int) (Math.random() * n);
            System.out.println(array[i]);
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
            max = array[i];
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
