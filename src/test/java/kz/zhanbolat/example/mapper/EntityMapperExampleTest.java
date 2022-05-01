package kz.zhanbolat.example.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntityMapperExampleTest {
    private RequestUserMapper requestUserMapper;

    @BeforeEach
    void init() {
        requestUserMapper = new RequestUserMapper();
    }

    // How can I check value myself without assert ?
    @Test
    void shouldAllFieldPresents_whenMap() {
        Request request = new Request();
        request.put("username", "testUser");
        request.put("password", "testPass");

        User user = requestUserMapper.map(request);

        // how can I assert ?
    }
}
