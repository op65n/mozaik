package org.op65n.mozaik.api.exception;

import org.jetbrains.annotations.Nullable;

public class AssertException extends MozaikException {

    public AssertException(final @Nullable String message, final @Nullable Object... replacements) {
        super(message, replacements);
    }

}

