public class Kaprekar {
    public static void main(String args[]) {
        int mod_part;
        int count = 0;
        int first_part;
        int second_part;
        for (int i = 1; i <= 999; i++) {
            int length = (int) Math.round(Math.log10(Math.pow(i, 2)) + 1);
            if (length > 1)
                mod_part = (int) Math.pow(10, (length / 2));
            else
                mod_part = 10;

            first_part = (int) Math.pow(i, 2) / mod_part;
            second_part = (int) Math.pow(i, 2) % mod_part;
            if ((i == first_part + second_part) && second_part != 0) {
                System.out.println(i + "\t" + (int) Math.pow(i, 2) + "\t" + first_part + "+"
                        + second_part);
                count += 1;
            }
        }
        System.out.println(count + " Kaprekar numbers.");
    }
}