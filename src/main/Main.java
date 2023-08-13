
public class Main {
    public static void main(String[] args) {
        //Создание объекта груза 1
        Cargo cargo1 = new Cargo(256, 500,
                "г. Москва, Большой Девятинский переулок № 8, 121099", true,
                "10216100/050318/0001564A", false);
        //Вывод информации о грузе
        cargo1.print();


        //Внесение изменения в габариты, вес и адрес доставки груза
        cargo1 = cargo1.setSize(24,23,80);
        cargo1 = cargo1.setWeight(1500.0);
        cargo1 = cargo1.setDeliveryAddress("г. Белгород, микрорайон Радуга, ул. Шершнева, 1А");
        //Вывод информации о грузе
        cargo1.print();

        //Создание груза 2 с помощью другого конструктора
        Cargo cargo2 = new Cargo(25,26, 70,1800,
                "г. Москва, Большой Девятинский переулок № 8, 121099", false,
                "10216100/050318/0001564Б", true);
        //Вывод информации о грузе
        cargo2.print();

        //Внесение изменения в габариты, вес и адрес доставки груза
        cargo2 = cargo2.setSize(40000);
        cargo2 = cargo2.setWeight(2000);
        cargo2 = cargo2.setDeliveryAddress("г. Белгород, микрорайон Радуга, ул. Шершнева, 1А");
        //Вывод информации о грузе
        cargo2.print();
    }
}
