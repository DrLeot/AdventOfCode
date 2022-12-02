package Day_2;

public enum Hand {

    A(1), // rock
    B(2), // paper
    C(3), // scissors
    X(1), // rock
    Y(2), // paper
    Z(3); // scissors

    private int value;

    Hand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
