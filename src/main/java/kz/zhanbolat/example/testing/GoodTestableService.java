package kz.zhanbolat.example.testing;

/**
 * Why is it good testable ?
 */
public class GoodTestableService implements Service {
    private ServiceDependency serviceDependency;

    public GoodTestableService(ServiceDependency serviceDependency) {
        this.serviceDependency = serviceDependency;
    }

    public void execute(String arg) {
        serviceDependency.performHeavyOperation(arg);
    }
}
