package Client;

import Wrestlers.Kane;
import Wrestlers.StoneCold;
import Wrestlers.Wrestler;

public class App {
    public static void main(String[] args) {
        Wrestler wrester1 = new Kane();
        Wrestler wrester2 = new StoneCold();

        wrester1.themeMusic();
        wrester1.finisher();
        wrester1.paymentForWork(5);

        wrester2.themeMusic();
        wrester2.finisher();
        wrester2.paymentForWork(5);

    }
}
