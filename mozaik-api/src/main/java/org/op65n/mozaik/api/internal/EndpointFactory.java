package org.op65n.mozaik.api.internal;

import org.jetbrains.annotations.NotNull;
import org.op65n.mozaik.api.exception.MozaikException;
import org.op65n.mozaik.api.util.Assert;
import org.slf4j.Logger;

public abstract class EndpointFactory<S> {

    private static Logger log = null;

    private S supplier;

    public void implementation(final @NotNull S supplier) {
        Assert.isNotNull(supplier, "Provided supplier is null");
        Assert.isNotNull(log, "[internal error] provided logger is null");

        this.supplier = supplier;
        log.debug("Registered API supplier for class {} with implementation {}", this.getClass().getName(), supplier.getClass().getName());
    }

    public @NotNull S implementation() {
        if (supplier == null) throw new NullEndpointException(this);
        return supplier;
    }

    public static void provideInternalLogger(final @NotNull Logger log) {
        Assert.isNotNull(log, "[internal error] provided logger is null");
        EndpointFactory.log = log;
    }

    private static class NullEndpointException extends MozaikException {

        public <S> NullEndpointException(final @NotNull EndpointFactory<S> endpoint) {
            super("API endpoint {} has a null supplier", endpoint.getClass().getName());
        }

    }

}

