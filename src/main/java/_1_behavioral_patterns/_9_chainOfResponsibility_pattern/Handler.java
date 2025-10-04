package _1_behavioral_patterns._9_chainOfResponsibility_pattern;

public abstract class Handler {
    private final Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void hande(HttpRequest request) {
        if (doHandle(request))
            return;

        if (nextHandler != null)
            nextHandler.hande(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}
