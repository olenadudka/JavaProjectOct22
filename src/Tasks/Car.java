package Tasks;

public abstract class Car {
   /*
   Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
    */
    double carPrice;
    String color;
    abstract double calculatePrice(double a, double b);

    }
class Sedan extends Car{
double length;

    @Override
    double calculatePrice(double length, double price) {

        this.length = length;
        carPrice = price;
        double returnPrice;
        if (length > 20) {
            returnPrice = carPrice * 0.95;
        } else {
            returnPrice = carPrice * 0.9;
        }
        return returnPrice;
    }}

class Truck extends Car{
    double weight;
    double returnPrice;

    @Override
    double calculatePrice(double weight, double price) {
        this.weight=weight;
        carPrice=price;
        if(weight>2000){
            returnPrice=carPrice*0.9;

        }else{
            returnPrice=carPrice*0.8;
        }
        return returnPrice;
    }
}
class TestCar{
    public static void main(String[] args) {
        Truck obj1=new Truck();
        Sedan obj2=new Sedan();
        System.out.println(obj1.calculatePrice(2500, 40000));
        System.out.println(obj2.calculatePrice(15, 2000));
    }
}