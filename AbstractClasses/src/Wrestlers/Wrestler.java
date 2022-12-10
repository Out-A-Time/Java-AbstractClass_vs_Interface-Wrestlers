package Wrestlers;

public abstract class Wrestler {
    public void paymentForWork(double hours) {
        System.out.println("The Wrestler will make $" + hours * 250 + " for tonight's match");
    }

    public abstract void themeMusic();

    public abstract void finisher();
}