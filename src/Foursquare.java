public class Foursquare extends Figures {
    private double side;

    public Foursquare(double side) {
        this.side = side;
    }

    public double perimeter() {
        return Math.ceil(side * 4);
    }

    @Override
    public double square() {
        return Math.ceil(Math.pow(side, 2));
    }

    @Override
    public Colors color() {
        return Colors.randomColor();
    }

    @Override
    public String draw() {
        return "Foursquare, " + "perimeter: " + perimeter()+"," + " square: " + square()+"," + " color: " + color();
    }
}
