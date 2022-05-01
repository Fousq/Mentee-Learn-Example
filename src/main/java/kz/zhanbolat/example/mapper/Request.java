package kz.zhanbolat.example.mapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Request {
    private Map<String, String> paramMap;

    public Request() {
        paramMap = new HashMap<>();
    }

    public Map<String, String> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<String, String> paramMap) {
        this.paramMap = paramMap;
    }

    public void put(String key, String val) {
        paramMap.put(key, val);
    }

    public Optional<String> get(String key) {
        return Optional.ofNullable(paramMap.get(key));
    }
}
