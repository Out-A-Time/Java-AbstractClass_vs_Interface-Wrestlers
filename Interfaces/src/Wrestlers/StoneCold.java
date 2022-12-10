package Wrestlers;

public class StoneCold implements Wrestler {

    @Override
    public void themeMusic() {
        System.out.println("Stone Cold intro music");
    }

    @Override
    public void finisher() {
        System.out.println("Stone Cold finisher move");
    }

    @Override
    public void paymentForWork(double hours) {
        System.out.println("Stone Cold will make $" + hours * 300 + " for his match");
    }

}
