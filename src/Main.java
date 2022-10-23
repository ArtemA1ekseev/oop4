public class Main {
    public static void main(String[] args) {
        /*
        Car ladaGranta = new Car("Lada", null, 1.7, "желтый", 2015, "России");
        ladaGranta.setGears("автомат");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 0, "черный", 2020, "Германии");
        audiA8.setSummerTyres(true);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021, "Германии");
        bmwZ8.setRegNumber("x412zc413");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 0, null);
        kiaSportage.setColor("титановый");
        Car hyundaiAvante = new Car(null, "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        hyundaiAvante.setEngineVolume(3.1);

        printInfoCar(ladaGranta);
        printInfoCar(audiA8);
        printInfoCar(bmwZ8);
        printInfoCar(kiaSportage);
        printInfoCar(hyundaiAvante);

        System.out.println();

        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", 301, 3500, "Белорусского вокзала", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", 270, 1700, "Ленинградского вокзала", "Ленинград-Пассажирский",8);

        printInfoTrain(lastochka);
        printInfoTrain(leningrad);

        System.out.println();

        Bus tourismo = new Bus("MERCEDES", "Tourismo", 2013, "Германии", "красного", 150);
        Bus granbird = new Bus("KIA", "Granbird", 2005, "Южной Кореи", "белого", 110);
        Bus bj = new Bus("Foton", "BJ 6126", 2003, "Китае", "белого", 140);

        printInfoBus(tourismo);
        printInfoBus(granbird);
        printInfoBus(bj);

        */
        PassengerCars ladaGranta = new PassengerCars("Lada", "Granta", 1.7);
        PassengerCars audiA8 = new PassengerCars("Audi", "A8 50 L TDI quattro", 1.3);
        PassengerCars bmwZ8 = new PassengerCars("BMW", "Z8", 3.0);
        PassengerCars kiaSportage = new PassengerCars("Kia", "Sportage", 2.4);
        printInfoPassengerCars(ladaGranta);
        printInfoPassengerCars(audiA8);
        printInfoPassengerCars(bmwZ8);
        printInfoPassengerCars(kiaSportage);
        System.out.println();
        Autobus tourismo = new Autobus("MERCEDES", "Tourismo", 3.2);
        Autobus granbird = new Autobus("KIA", "Granbird", 3.4);
        Autobus bj = new Autobus("Foton", "BJ 6126", 3.1);
        Autobus bj1 = new Autobus("Fotonius", "BJ 12", 3.3);
        printInfoAutobus(tourismo);
        printInfoAutobus(granbird);
        printInfoAutobus(bj);
        printInfoAutobus(bj1);
        System.out.println();
        Trucks ural = new Trucks("УРАЛ", "21-31", 1.2);
        Trucks daf = new Trucks("Daf", "3", 1.3);
        Trucks scania = new Trucks("Scania", "13-m", 2.2);
        Trucks iveco = new Trucks("Iveco", "31-fa", 3.1);
        printInfoTrucks(ural);
        printInfoTrucks(daf);
        printInfoTrucks(scania);
        printInfoTrucks(iveco);
        System.out.println();

        Car car = new Car("Kia", "Rio", 1.4);
        DriverB driverB = new DriverB("А.В.В", 4, car);
        System.out.println(driverB);
    }
    /*
    private static void printInfoCar(Car car) {
        System.out.println("Бренд автомобиля — " + car.getBrand()
                + ", модель — " + car.getModel() + ", сборка в "
                + car.getProductionCountry() + ", цвет кузова — " + car.getColor()
                + ", объем двигателя — " + car.getEngineVolume() + " л, год выпуска — "
                + car.getProductionYear() +
                ", коробка передач: " + car.getGears() +
                ", тип кузова: " + car.getTypeOfBody() +
                ", рег. номер: " + car.getRegNumber() +
                ", кол-во мест: " + car.getCountSeats() +
                ", " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина" +
                ", " + (car.getKey().isWithoutKeyAccess() ? "безключевой доступ" : "ключевой доступ") +
                ", " + (car.getKey().isRemoteRunEngine() ? "удаленный запуск" : "обычный запуск") +
                ", номер страховки: " + car.getInsuranse().getNumber() +
                ", стоимость страховки: " + car.getInsuranse().getCost() +
                ", срок действия страховки: " + car.getInsuranse().getExpireDate() + car.refill()
        );
    }

    private static void printInfoTrain(Train train) {
        System.out.println("Поезд " + train.getBrand()
                + ", модель " + train.getModel() + ", "
                + train.getProductionYear() + " год выпуска в " + train.getProductionCountry()
                + ", скорость передвижения – " + train.getMaxSpeed() + " км/ч, отходит от "
                + train.getStationNameDepartures() + " и следует до станции " + train.getFinalStop() +
                ". Цена поездки – " + train.getPriceTrips() +
                " рублей, в поезде " + train.getQuantityWagons() +
                " вагонов." + train.refill()
        );
    }

    private static void printInfoBus(Bus bus) {
        System.out.println("Автобус " + bus.getBrand()
                + ", модель " + bus.getModel() + ", "
                + bus.getProductionYear() + " год выпуска в " + bus.getProductionCountry()
                + ", скорость передвижения – " + bus.getMaxSpeed() + " км/ч, "
                + bus.getColor() + " цвета." + bus.refill()
        );
    }
    */
    private static void printInfoPassengerCars(PassengerCars passengerCars) {
        System.out.println(new StringBuilder().append("Легковой автомобиль - ").append(passengerCars.getBrand()).append(", модель - ").append(passengerCars.getModel()).append(", объём двигателя - ").append(passengerCars.getEngineVolume()).append(" ").append(passengerCars.starMoving()).append(" ").append(passengerCars.stopMoving()).append(" ").append(passengerCars.pitStop()).append(" ").append(passengerCars.bestLapTime()).append(" ").append(passengerCars.MaximumSpeed()).toString());
    }
    private static void printInfoAutobus(Autobus autobus) {
        System.out.println("Автобус - " + autobus.getBrand()
                + ", модель - " + autobus.getModel() + ", объём двигателя - "
                + autobus.getEngineVolume() + " " + autobus.starMoving() + " " + autobus.stopMoving() + " " + autobus.pitStop() + " " + autobus.bestLapTime() + " " + autobus.MaximumSpeed());
    }
    private static void printInfoTrucks(Trucks trucks) {
        System.out.println("Грузовой автомобиль - " + trucks.getBrand()
                + ", модель - " + trucks.getModel() + ", объём двигателя - "
                + trucks.getEngineVolume() + " " + trucks.starMoving() + " " + trucks.stopMoving() + " " + trucks.pitStop() + " " + trucks.bestLapTime() + " " + trucks.MaximumSpeed());
    }
}