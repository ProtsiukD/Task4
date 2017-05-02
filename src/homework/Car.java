package homework;

/**
 * Created by prots on 01.05.2017.
 */
public class Car {
    private String type;
    private int yearProduction;
    private double engineCapacity;

    Car(String type, int yearProduction, double engineCapacity) {
        setType(type);
        setYearProduction(yearProduction);
        setEngineCapacity(engineCapacity);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public static int checkYear(Car[] cars, int year){
        int tmp = 0;
        for (Car car : cars){
            if(car.yearProduction==year)
            {
                tmp = car.yearProduction;
            }
        }
        return tmp;
    }

    public static String sortPrint(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (cars[i].yearProduction > cars[j].yearProduction) {
                    Car tmp = cars[i];
                    cars[i] = cars[j];
                    tmp = cars[j];
                }
            }
        }
        String tmp1 = "";
        for (int i = 0; i < cars.length; i++) {
            String d = tmp1;
            tmp1 = d + '\n' + cars[i].getType() + " " + cars[i].getYearProduction() + " " + cars[i].getEngineCapacity();
        }
        return tmp1;
    }


    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2003, 1.3);
        Car car2 = new Car("Mercedes", 2005, 5.0);
        Car car3 = new Car("Audi", 2005, 4.9);
        Car car4 = new Car("Ford", 2010, 2.8);
        Car[] cars = {car1, car2, car3, car4};
        System.out.println(checkYear(cars, 2003));
        System.out.println(sortPrint(cars));
    }
}
