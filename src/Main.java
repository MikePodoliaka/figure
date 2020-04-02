import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        fill();
    }

        public static Figures[] fill() {
            Random capacity = new Random();
            int arrSize = capacity.nextInt(1000);
            Figures[] array = new Figures[arrSize];
            Figures obj = null;
            Random randomizer = new Random();
            for (int i=0; i<arrSize; i++) {
                int randomNumber = randomizer.nextInt(4);
                switch(randomNumber) {
                    case 0:
                        double radius = Math.random();
                        obj = new Circle(radius);
                        break;
                    case 1:
                        double side = Math.random();
                        obj = new Foursquare(side);
                        break;
                    case 2:
                        double side1 = Math.random();
                        double side2 = Math.random();
                        double height = Math.random();
                        obj = new Trapeze(side1,side2,height);
                        break;
                    case 3:
                        double sideTr = Math.random();
                        double heightTr = Math.random();
                        obj = new Triangle(sideTr,heightTr);
                        break;
                }
                array[i] = obj;
                System.out.println(i + " "+array[i].draw());
            }
            return array;
        }
    }

