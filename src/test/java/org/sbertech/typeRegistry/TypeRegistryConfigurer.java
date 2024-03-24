package org.sbertech.typeRegistry;

import io.cucumber.core.api.TypeRegistry;

import java.util.Locale;

public interface TypeRegistryConfigurer {
    Locale locale();

    void configureTypeRegistry (TypeRegistry typeRegistry);
}
