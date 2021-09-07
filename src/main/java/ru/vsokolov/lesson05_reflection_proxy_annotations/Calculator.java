package ru.vsokolov.lesson05_reflection_proxy_annotations;

public interface Calculator {
    @Metric
    int calc(int number);

}
