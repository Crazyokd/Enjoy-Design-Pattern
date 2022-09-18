public abstract class Shape {
    public String color;

    public Shape() {

    }
    public Shape(Shape target) {
        if (target != null) {
            this.color = target.color;
        }
    }

    public abstract Shape clone();
}

class Circle extends Shape {
    public int radius;

    public Circle() {

    }
    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}

class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {

    }
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public Shape clone() {
        return new Rectangle(this);
    }
}

