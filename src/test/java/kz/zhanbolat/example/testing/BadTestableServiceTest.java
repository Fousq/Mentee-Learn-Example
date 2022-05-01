package kz.zhanbolat.example.testing;

import kz.zhanbolat.example.testing.BadTestableService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BadTestableServiceTest {
    private BadTestableService service;

    @BeforeEach
    void init() {
        service = new BadTestableService();
    }

    @Test
    void shouldTestBehaviour() {
        Assertions.assertDoesNotThrow(() -> service.execute("test"));
    }
}
