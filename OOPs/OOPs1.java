class OOPs1 {
        public static void main(String[] args) {
                Vehicle v = new Car();

                v.print();//Here print "Child Class(Car) reason is method overriding"

                /* Vehicle v2 = new Vehicle();
                v2.print(); */

                /* Car c = new Car();
                c.print(); */

        }
}

class Vehicle {
        String color;
        int number;

        void print(){
                System.out.println("Base Class(Vehicle)");
        }
}

class Car extends Vehicle {
        int wheel;

        void print(){
                System.out.println("Child Class(Car)");
        }
}