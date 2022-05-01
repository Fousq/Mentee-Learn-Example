package kz.zhanbolat.example.testing;

import kz.zhanbolat.example.testing.stub.StubServiceDependency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GoodTestableServiceStubTest {
    private GoodTestableService service;

    @BeforeEach
    void init() {
        ServiceDependency serviceDependency = new StubServiceDependency();
        service = new GoodTestableService(serviceDependency);
    }

    @Test
    void shouldTestBehaviour() {
        Assertions.assertDoesNotThrow(() -> service.execute("test"));
    }
}
