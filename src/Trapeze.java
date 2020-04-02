public class Trapeze extends Figures {
    private double side1;
    private double side2;
    private double height;

    public Trapeze(double side1, double side2, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public double median() {
        return Math.ceil((side1 + side2) / 2);
    }

    @Override
    public double square() {
        return Math.ceil((side1 + side2) / 2 * height);
    }

    @Override
    public Colors color() {
        return Colors.randomColor();
    }

    @Override
    public String draw() {
        return "Trapeze, " + "median: " + median() + "," + " square: " + square() + "," + " color: " + color();
    }
}
