public class Shop extends Thread{
    private int[] money;
    private Accaunt accaunt;
    public Shop(String nameShop, int[] money, Accaunt accaunt){
        super(nameShop);
        this.money = money;
        this.accaunt = accaunt;
    }

    @Override
    public void run() {
        System.out.println("Магазин " + Thread.currentThread().getName() + " считает деньги...");
        long result = 0;
        for (int i = 0; i < money.length; i++){
            result += money[i];
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Магазин " + Thread.currentThread().getName() + " посчитал выручку и перевел " + result);
        accaunt.transfer(result);

    }
}
