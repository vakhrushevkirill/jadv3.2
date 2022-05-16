import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        genValue(array1);
        genValue(array2);
        genValue(array3);

        Accaunt accaunt = new Accaunt();
        Thread shop1 = new Shop("Rok", array1, accaunt);
        Thread shop2 = new Shop("Boss", array2, accaunt);
        Thread shop3 = new Shop("Pum", array3, accaunt);
        shop1.start();
        shop2.start();
        shop3.start();

        shop1.join();
        shop2.join();
        shop3.join();
        System.out.println("Общее поступление в налоговую составило " + accaunt.getAccount());
    }



    public static void genValue(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5000);
        }
    }
}
