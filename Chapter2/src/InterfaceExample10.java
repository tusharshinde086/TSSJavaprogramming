interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class InterfaceExample10 {
    public static void drawShape(Drawable d) {
        d.draw();
    }

    public static void main(String[] args) {
        Drawable circle = new Circle();
        drawShape(circle);
    }
}

