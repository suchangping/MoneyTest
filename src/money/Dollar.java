package money;

public class Dollar extends Money {

    //private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    /*public boolean equals(Object object) {
        //Dollar dollar = (Dollar) object;
        Money money = (Money) object;
        return amount == money.amount;
    }*/
}
