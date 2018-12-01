package ch_03;

import java.util.Random;

/**
 * Created by ito on 13.09.17.
 */
class Coin{
    int side;
    Coin(){
        side = new Random().nextInt(2);
    }
}
public class CoinTest {
    public static void main(String[] args) {
        Coin coin;
        for (int i = 0; i < 10; i++){
            coin = new Coin();
            System.out.println(coin.side);
        }
    }
}
