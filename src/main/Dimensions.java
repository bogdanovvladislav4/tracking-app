
public class Dimensions {
    //Длина, ширина, высота
    private  final double length;
    private  final double width;
    private  final double height;
    //Конструктор для создания объекта
    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //Метод для рассчета габаритов
    public double volumeСalculation(){
        return length*width*height;
    }
}
