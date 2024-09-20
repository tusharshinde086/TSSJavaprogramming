package chapter2;

class Superclass {
    protected int num;

    public Superclass(int num) {
        this.num = num;
    }
}

class Subclass extends Superclass {
    private int num;

    Subclass(int a, int b) {
        super(a);
        this.num = b;
    }

    void display() {
        System.out.println("In superclass, num = " + super.num);
        System.out.println("In subclass, num = " + num);
    }
}

 class Test{
    public static void main(String[] args) {
        Subclass obj = new Subclass(11, 34);
        obj.display();
    }
}
