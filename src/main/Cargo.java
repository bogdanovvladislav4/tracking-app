
public class Cargo {
    private final double size;
    private final double weight;
    private final String deliveryAddress;
    private final boolean property;
    private final String registrationNumber;
    private final boolean fragile;

    //Конструктор для создания объекта с расчетом габаритов на основе данных о длины, ширины и высоты
    public Cargo(double length, double width, double height, double weight, String deliveryAddress,
                 boolean property, String registrationNumber, boolean fragile) {
        Dimensions dimensions = new Dimensions(length, width, height);
        this.size = dimensions.volumeСalculation();
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }
    //Конструтор для создания объектов без расчета габаритов
    public Cargo(double size, double weight, String deliveryAddress,
                 boolean property, String registrationNumber, boolean fragile) {
        this.size = size;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    //Изменение габаритов с помощью расчетов на основе длины, ширины, высоты
    public Cargo setSize(double length, double width, double height) {
        Dimensions dimensions = new Dimensions(length, width, height);
        double changeSize = dimensions.volumeСalculation();
        return new Cargo(changeSize, weight, deliveryAddress, property, registrationNumber, fragile);
    }
    //Изменение габаритов без расчетов
    public Cargo setSize(double size){
        return new Cargo(size, weight, deliveryAddress, property, registrationNumber, fragile);
    }
    //Изменения веса груза.
    public Cargo setWeight(double weight) {
        return new Cargo(size, weight, deliveryAddress, property, registrationNumber, fragile);
    }
    //Изменение адреса доставки груза
    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(size, weight, deliveryAddress, property, registrationNumber, fragile);
    }

    //=========================================================================================

    //Методы-геттеры.
    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isProperty() {
        return property;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    //Метод отображает информацию о грузе
    public void print(){
        System.out.println("Информация о грузе: ");
        System.out.println("Габариты груза: " + getSize() + " мм³");
        System.out.println("Вес груза: " + getWeight() + " г ");
        System.out.println("Адрес доставки груза: " + getDeliveryAddress());
        System.out.println("Можно ли переворачивать груз : " + isProperty());
        System.out.println("Рецистрационный номер груза: " + getRegistrationNumber());
        System.out.println("Является ли груз хрупким: " + isFragile());
        System.out.println("================================================================");
    }
}
