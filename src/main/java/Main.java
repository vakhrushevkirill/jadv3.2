import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int size = 10;
        int countShop = 3;
        String[] nameShop = new String[]{"Rok", "Boss", "Pum"};

        Accaunt accaunt = new Accaunt();
        List<Thread> shops = new ArrayList();
        for (int i = 0; i < countShop; i++){
            Thread shop = new Shop(nameShop[i], genValue(size), accaunt);
            shops.add(shop);
            shop.start();
        }
        for (int i = 0; i < shops.size(); i++){
            shops.get(i).join();
        }
        System.out.println("Общее поступление в налоговую составило " + accaunt.getAccount());
    }



    public static int[] genValue(int size){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5000);
        }
        return array;
    }
}
