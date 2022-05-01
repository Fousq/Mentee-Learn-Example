package kz.zhanbolat.example.testing;

/**
 * There's a question, should I test this class or not, and how should I test it?
 */
public class LogicRichService implements Service {
    private ServiceDependency serviceDependency;

    public LogicRichService(ServiceDependency serviceDependency) {
        this.serviceDependency = serviceDependency;
    }

    public void execute(String arg) {
        if (arg == null || arg.isEmpty()) {
            throw new IllegalArgumentException("Empty string");
        }
        serviceDependency.performHeavyOperation(arg);
    }
}
