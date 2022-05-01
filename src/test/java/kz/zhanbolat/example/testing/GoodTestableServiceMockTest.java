package kz.zhanbolat.example.testing;

import kz.zhanbolat.example.testing.GoodTestableService;
import kz.zhanbolat.example.testing.ServiceDependency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class GoodTestableServiceMockTest {
    private GoodTestableService service;

    private ServiceDependency serviceDependency;

    @BeforeEach
    void init() {
        serviceDependency = mock(ServiceDependency.class);
        service = new GoodTestableService(serviceDependency);
    }

    @Test
    void shouldTestBehaviour() {
        Assertions.assertDoesNotThrow(() -> service.execute("test"));
    }

    @Test
    void shouldThrowExceptionFromDependency() {
        doThrow(new RuntimeException()).when(serviceDependency).performHeavyOperation(anyString());

        Assertions.assertThrows(Exception.class, () -> service.execute("test"));
    }
}
