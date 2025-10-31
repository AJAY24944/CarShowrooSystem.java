public class Car {
    static String showroomName = "Elite Moters";
    String CarModel = "Tesla Model S";
    int CarPrice = 80000;
    public void displayDetails(){
        System.out.println("ShowroomName :" + showroomName);
        System.out.println("Car Model :" + CarModel);
        System.out.println("Car Price :" + CarPrice);
    }
    public static void main(String[] args) {
        Car obj1 = new Car();
        Car obj2 = new Car();
        obj1.CarModel = "BMW X5";
        obj2.CarPrice = 75000;

        obj1.displayDetails();
        obj2.displayDetails();
    }

}