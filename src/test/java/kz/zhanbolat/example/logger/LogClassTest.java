package kz.zhanbolat.example.logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogClassTest {

    @Test
    void shouldBeTheSameLogger_whenStatic() {
        StaticLogClass logClass = new StaticLogClass();
        StaticLogClass newLogClass = new StaticLogClass();

        logClass.execute();
        newLogClass.execute();

        assertEquals(logClass.getLogger(), newLogClass.getLogger());
    }

    @Test
    void shouldBeTheSameLogger() {
        NonStaticLogClass logClass = new NonStaticLogClass();
        NonStaticLogClass newLogClass = new NonStaticLogClass();

        logClass.execute();
        newLogClass.execute();

        assertEquals(logClass.getLogger(), newLogClass.getLogger());
    }
}
