public class Car extends Bicycle {
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void check() {
        super.check();
        checkEngine();
    }
}
