public class Main {
    public static void main(String[] args) {
        Logger logger1=Logger.getLogger();
        logger1.log("This is Logger 1");

        Logger logger2=Logger.getLogger();
        logger2.log("This is logger 2");

        System.out.println(logger1==logger2);
    }
}
