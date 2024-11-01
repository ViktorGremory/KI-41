abstract class AbstractClass {
    public int predmet;
    public int yrock;
    public String className;

    public AbstractClass(String className, int predmet, int yrock) {
        this.className = className;
        this.predmet = predmet;
        this.yrock = yrock;
    }

    public abstract void specificMethod();
}

class ConcreteClass extends AbstractClass {
    public ConcreteClass(String className, int predmet, int yrock) {
        super(className, predmet, yrock);
    }

    @Override
    public void specificMethod() {
        System.out.println("This is a specific implementation of the abstract method.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass concreteObject = new ConcreteClass("Class Name", 10, 2023);
        concreteObject.specificMethod();
    }
}