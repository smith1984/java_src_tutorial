package Ch_3;

/**
 * Created by ito on 20.03.17.
 */
public class BasketDemo {
    public static void main (String [] args){
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();

        System.out.println("b1: ");
        b1.pay(1200.00);
        System.out.println("b2: ");
        b2.pay("0012456892143654");
        System.out.println("b3: ");
        b3.pay("8754357674535735", "1242345");
    }
}

class Basket{
    void pay(double money){
        System.out.println("Оплачено наличными: " + money);
    }

    void pay(String cardNum){
        System.out.println("Оплачено картой №: " +cardNum);
    }

    void pay(String accountNum, String bankCode){
        System.out.println("Переведено на счет №: " + accountNum + " в банке: " + bankCode);
    }
}
