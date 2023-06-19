package Java;
public class reverseKata {
    public static void main(String[] args) {
        String input = "Inputannya apa ya?";
        String reversed = reverse(input);
        System.out.println("String terbalik: " + reversed);
    }

    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

}
