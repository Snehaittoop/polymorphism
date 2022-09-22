public class Veh {
    String color;
    String brand;
    String modelName;
    int modelYear;
    void EngineCapacity(){
        System.out.println("2000cc");
    }
}
class Bmw extends Veh{
    void EngineCapacity(){
        System.out.println("4440cc");
    }
}
class Benz extends Veh{
    void EngineCapacity(){
        System.out.println("2800c");
    }
}
class Mainclass{
    public static void main(String[] args) {
        Veh v=new Veh();
        v.EngineCapacity();

        Veh v1=new Bmw();
        v1.EngineCapacity();
        Veh v2=new Benz();
        v2.EngineCapacity();


    }
}
