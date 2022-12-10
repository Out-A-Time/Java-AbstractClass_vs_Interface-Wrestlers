package Wrestlers;

public class Kane implements Wrestler {

    @Override
    public void themeMusic() {
        System.out.println("Kane intro music");
    }

    @Override
    public void finisher() {
        System.out.println("Kane finisher move");
    }

    @Override
    public void paymentForWork(double hours) {
        System.out.println("Kane will make $" + hours * 400 + " for his match");
    }

}
