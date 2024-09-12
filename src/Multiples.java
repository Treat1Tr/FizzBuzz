public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int counter = 0;
        while(i < 1000){
            boolean div3 = i % 3 == 0;
            boolean div5 = i % 5 == 0;

            if (div3 || div5){
                counter++;
            }
            i++;
        }
        System.out.println(counter);
    }
}
