package kz.zhanbolat.example.mapper;

/**
 * What is this ? Why was this written like this ? how can it be improved ?
 * @param <T>
 * @param <K>
 */
public interface EntityMapper<T, K> {
    K map(T arg);
}
