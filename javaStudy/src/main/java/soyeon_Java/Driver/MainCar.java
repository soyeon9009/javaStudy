package soyeon_Java.Driver;



public class MainCar {
    public static void main(String[] args) {
        // BusA bus = new BusA();
        // Taxi taxi = new Taxi();


        // bus.bus();
        // taxi.taxi();


         Driver a = new Pro();


         System.out.println("고속도로 진입 전");
         cc((Master) a);
         System.out.println("고속도로 진입 후");
         aa((Pro) a);

         System.out.println("고속도로 나옴");
         bb((Beginner) a);

         System.out.println("cc");





    }

//    private static void instanceOfMethod(Driver M) {
//        if( M instanceof Beginner ){
//            System.out.println("1번");
//        } else if (M instanceof Master) {
//            System.out.println("2번");
//        } else if (M instanceof  Pro) {
//            System.out.println("3번");
//        }
//    }
//
    public static void aa(Pro A){
            A.info();
        }
        public static void bb(Beginner A){
            A.info();
            System.out.println("cc");
        }
        public static void cc(Master A){
            System.out.println(A.getClass().getName());
            A.info();
        }






        //매개변수의 자동 타입 변환
//                animalSound(new Dog(), new Cat());
//                // animalSound(new Cat());
//                }
//
//
//public static void animalSound(Animal animal, Animal ani) {
//        animal.sound();
//        ani.sound();

}
