package ru.aazizova.patterns.prototype;

import ru.aazizova.patterns.prototype.shapes.Circle;
import ru.aazizova.patterns.prototype.shapes.Rectangle;
import ru.aazizova.patterns.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aazizova on 10.10.2018.
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        for(Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + ": Shapes are different objects (yay!)");
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i + ": Shapes are different objects (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }

        }
    }
}
