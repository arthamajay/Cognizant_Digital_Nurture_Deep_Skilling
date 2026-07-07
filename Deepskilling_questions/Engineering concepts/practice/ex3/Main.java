public class Main {
    public static void main(String[] args) {
        Computer c=new Computer.ComputerBuilder("Hp").setRAM(8).setStorage(256).build();
        System.out.println(c.price);
    }    
}
