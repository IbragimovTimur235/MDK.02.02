

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Circle circle= new Circle();
Square square = new Square();
Rectangle rectangle = new Rectangle();
Ellipse ellipse = new Ellipse();
 //...
    circle.drawCircle();
    square.drawSquare();
    rectangle.drawRectangle();
    ellipse.drawCircle();
    ellipse.circleToEllipse();
}


public class Figure {
    public void drawCircle() {
        System.out.println("Рисуем круг");
    }

    public void drawSquare() {
        System.out.println("Рисуем квадрат");
    }

    public void drawRectangle() {
        System.out.println("Рисуем прямоугольник");
    }
}

public class Circle extends Figure{
    @Override
    public void drawCircle() {
        super.drawCircle();
    }
}

public class Square extends Figure{
     @Override
     public void drawSquare() {
         super.drawSquare();
     }
}

public class Rectangle extends Figure{
    @Override
    public void drawRectangle() {
        super.drawRectangle();
    }
}

class Ellipse extends Figure{
    @Override
    public void drawCircle() {
        super.drawCircle();
    }
    public void circleToEllipse() {
        System.out.println("Превращаем круг в овал");
    }
}
