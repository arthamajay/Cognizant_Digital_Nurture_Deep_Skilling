public class BuilderTest {
    public static void main(String[] args) {
        Computer computer=new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(512)
                .build();

        computer.display();

        Computer budget=new Computer.Builder()
                .setCpu("AMD Ryzen 5")
                .setRam(8)
                .setStorage(256)
                .build();

        budget.display();
    }
}
