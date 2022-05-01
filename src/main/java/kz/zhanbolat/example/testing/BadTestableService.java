package kz.zhanbolat.example.testing;

/**
 * Why is it a bad testable service ?
 */
public class BadTestableService implements Service {
    private ServiceDependency serviceDependency = new HeavyServiceDependency();

    @Override
    public void execute(String arg) {
        serviceDependency.performHeavyOperation(arg);
    }
}
