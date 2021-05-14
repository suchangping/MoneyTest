package money;

public class Franc extends Money {
    //private int amount;

    Franc(int amount) {
        this.amount = amount;
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    /*public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }*/
}
