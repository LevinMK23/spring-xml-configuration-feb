package ru.learnUp.feb;

import java.util.Collection;
import java.util.Set;

public class ModelsRepository {

    private final Datasource datasource;

    public ModelsRepository(Datasource datasource) {
        this.datasource = datasource;
    }

    public Collection<Long> getModelsByVendor(long vendorId) {
        return Set.of(1L, 2L, 3L);
    }

    public Collection<Long> getModelsByCategory(long categoryId) {
        return Set.of(5L, 6L, 7L);
    }

}
