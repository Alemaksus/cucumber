package org.sbertech.typeRegistry;

import io.cucumber.core.api.TypeRegistry;
//import io.cucumber.core.api.TypeRegistry.TypeRegistryConfigurer;

import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import java.util.Locale;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return new Locale("ru");
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<LocalDate>(
                "localdate",
                "[0-9](2).[0-9](2).[0-9](4)",
                LocalDate.class,
                new Transformer<LocalDate>() {
                    @Override
                    public LocalDate transform(String arg) throws Throwable {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                        return LocalDate.parse(arg, formatter);
                    }
                }
        ));
    }
}
