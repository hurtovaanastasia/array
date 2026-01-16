import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        {
            int[] nums = new int[20];
            Random random = new Random();
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(16);
            }
            System.out.println("Создан массив: ");
            for (int num : nums) {
                System.out.println(num + " ");
            }
            Map<Integer, Integer> counter = new HashMap<>();
            for (int num : nums) {
                counter.put(num, counter.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("Число " + entry.getKey() + " повторяется " + entry.getValue() + " раз.");
                }
            }
        }
    }
}