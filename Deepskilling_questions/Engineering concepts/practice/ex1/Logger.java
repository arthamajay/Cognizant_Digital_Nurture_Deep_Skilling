
public class Logger {
    private static Logger logger;

    private Logger(){
        // Logger Contrsuctor
    }

    public static Logger getLogger(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
