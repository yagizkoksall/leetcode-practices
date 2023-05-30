package practices;

public class ReverseInteger {
    public int reverse(int x) {
        String a = "";
        if (x != 0) {


            int negative = 1;
            if (x < 0) {
                x *= -1;
                negative = -1;

            }

            while (x > 0) {

                a += String.valueOf(x % 10);
                x /= 10;

            }

            try {
                int num = Integer.parseInt(a);
                num *= negative;
                return num;
            } catch (Exception e) {
                return 0;
            }


        } else {
            return x;
        }
    }
}
