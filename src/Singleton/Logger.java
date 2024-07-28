package Singleton;

public class Logger {
    private static Logger intance ;
    private Logger(){}
    public static Logger getInstance()
    {
        synchronized (Logger.class)
        {
            if (intance == null)
            {
                if (intance == null)
                    intance = new Logger();
            }
        }

        return intance;
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
    }
}
// only 1 instance of this class is created even in multi thread pattern
//lazy initialization
// early

// prob (race cond)
// 1) synchronized -> allow one thread to go in -> this is not the perfect sol
// 2) if i am doing early initialization , will the prob of race condn comes to us ?
// make the class early initialized ? -> this is not the perfect sol

// 3)
