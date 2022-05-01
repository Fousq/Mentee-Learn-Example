package kz.zhanbolat.example.testing;

import java.util.concurrent.TimeUnit;

public class HeavyServiceDependency implements ServiceDependency {

    public void performHeavyOperation(String arg) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
