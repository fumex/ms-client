package com.sgcan.msclient.util;

import java.util.List;

public interface ICrud <T, V> {
    T save(T t);
    void deleteById(V v);
    T findById(V id);
    List<T> findAll();
}
