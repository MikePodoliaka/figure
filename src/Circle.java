public class Circle extends Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double diameter() {
        return Math.ceil(Math.pow(radius, 2));
    }

    @Override
    public double square() {
        return Math.ceil(Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public Colors color() {
        return Colors.randomColor();
    }

    @Override
    public String draw() {
        return "Circle, " + "diameter: " + diameter()+"," + " square: " + square()+"," + " color: " + color();
    }
}
