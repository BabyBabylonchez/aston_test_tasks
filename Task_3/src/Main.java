public class Main {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int j : array1) {
            if(j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
