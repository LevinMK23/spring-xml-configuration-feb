package ru.learnUp.feb;

import java.util.Collection;

public class ModelsService {

    private final ModelsRepository modelsRepository;
    private final HttpClient client;

    public ModelsService(ModelsRepository modelsRepository, HttpClient client) {
        this.modelsRepository = modelsRepository;
        this.client = client;
    }

    public Collection<Model> getModels(long vendorId) {
        Collection<Long> models = modelsRepository.getModelsByVendor(vendorId);
        return client.enrichModelWithImagesAndName(models);
    }

}
