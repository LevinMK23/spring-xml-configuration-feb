package ru.learnUp.feb;

import java.util.Collection;
import java.util.stream.Collectors;

public class HttpClient {

    public Collection<Model> enrichModelWithImagesAndName(Collection<Long> modelIds) {
        return modelIds.stream()
                .map(id -> new Model(id, "Model", "url"))
                .collect(Collectors.toList());
    }

}
