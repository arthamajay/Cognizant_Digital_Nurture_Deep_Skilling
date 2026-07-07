public class Computer {
    String name;
    int RAM;
    int Storage;
    String CPU; 
    long price;
    private Computer(ComputerBuilder cb){
        this.name=cb.name;
        this.Storage=cb.Storage;
        this.RAM=cb.RAM;
        this.CPU=cb.CPU;
        this.price=cb.price;
    }

    public static class ComputerBuilder{
        String name;
        int RAM;
        int Storage;
        String CPU; 
        long price;
        public ComputerBuilder(String name){
            this.name=name;
        }

        public ComputerBuilder setRAM(int RAM){
            this.RAM=RAM;
            return this;
        }
        public ComputerBuilder setStorage(int Storage){
            this.Storage=Storage;
            return this;
        }
        public ComputerBuilder setCPU(String CPU){
            this.CPU=CPU;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}

