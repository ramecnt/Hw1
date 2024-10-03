public class Truck extends Car {
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check() {
        super.check();
        checkTrailer();
    }
}
