package org.example.implementation;

import org.example.api.NameProvider;

public class NameProviderImpl implements NameProvider {
    @Override
    public String getName() {
        return "world";
    }
}
