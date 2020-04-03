public class Triangle extends Figures {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double hypotenuse() {
        return Math.ceil(Math.sqrt(Math.pow(side, 2) + Math.pow(height, 2)));
    }

    @Override
    public double square() {
        return Math.ceil((side * height) / 2);
    }

    @Override
    public Colors color() {
        return Colors.randomColor();
    }

    @Override
    public String draw() {
        return "Triangle, " + "hypotenuse: " + hypotenuse() + "," + " square: "
                + square() + "," + " color: " + color();
    }
}
