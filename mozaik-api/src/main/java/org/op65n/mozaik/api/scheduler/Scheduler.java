package org.op65n.mozaik.api.scheduler;

import org.jetbrains.annotations.NotNull;
import org.op65n.mozaik.api.internal.EndpointFactory;
import org.slf4j.Logger;

public interface Scheduler {

    <R> TaskPromise<R> async(final @NotNull Task<R> task);

    <R> TaskPromise<R> sync(final @NotNull Task<R> task);

    final class Factory extends EndpointFactory<Factory.FactorySupplier> {

        public final static EndpointFactory<FactorySupplier> API = new Factory();

        public static @NotNull Logger create(final @NotNull Class<?> source) {
            return API.implementation().supply(source);
        }

        public interface FactorySupplier {

            @NotNull Logger supply(final @NotNull Class<?> source);

        }

    }

}
