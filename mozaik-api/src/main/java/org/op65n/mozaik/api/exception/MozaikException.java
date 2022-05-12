package org.op65n.mozaik.api.exception;

import org.jetbrains.annotations.Nullable;
import org.op65n.mozaik.api.util.StringUtils;

public class MozaikException extends RuntimeException {

    static final long serialVersionUID = -7034897190745766939L;

    public MozaikException(final @Nullable String message, final @Nullable Object... replacements) {
        super(StringUtils.format(message, replacements));
    }

}
