package org.op65n.mozaik.api.exception;

import org.jetbrains.annotations.NotNull;

public class PrivateConstructorException extends MozaikException {

    public PrivateConstructorException(final @NotNull Class<?> clazz) {
        super("Instance of {} is not accessible", clazz.getName());
    }

}

