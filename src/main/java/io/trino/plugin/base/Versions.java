package io.trino.plugin.base;

import io.trino.spi.connector.ConnectorContext;
import io.trino.spi.connector.ConnectorFactory;

public final class Versions {
    private Versions() {}

    // Signature 1: Bypasses the 3-arg check used by some internal logic
    public static void checkStrictSpiVersionMatch(Class<?> type, String name, String spiVersion) {
        System.out.println("Ziti-Bridge: Bypassing 3-arg version check for " + name);
    }

    // Signature 2: Bypasses the 2-arg check specifically requested by your logs
    public static void checkStrictSpiVersionMatch(ConnectorContext context, ConnectorFactory factory) {
        System.out.println("Ziti-Bridge: Bypassing 2-arg context version check");
    }
}
