package _1_behavioral_pattern._9_chainOfResponsibility_pattern;

public class Logger extends Handler {
      public Logger(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
