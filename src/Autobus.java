public class Autobus extends Car implements Competing{

    public Autobus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String starMoving() {
        return "Аккумулятор в общем начинает крутить генератор, который в свою очередь напрямую связан с двигателем и начинает крутить там роторы. Которые в свою очередь начинают раскручивать все системы и начинается подача бензина в двигатель по каплям.";
    }


    @Override
    public String pitStop() {
        return "Количество остановок на ремонт 4.";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга 19.31 мин";
    }

    @Override
    public String MaximumSpeed() {
        return "Максимальное скорость 94 км/ч.";
    }
}
