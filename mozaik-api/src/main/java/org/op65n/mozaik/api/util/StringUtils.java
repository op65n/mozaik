package org.op65n.mozaik.api.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.regex.Matcher;

public final class StringUtils {

    public static @NotNull String format(final @Nullable String string, final @Nullable Object... replacements) {
        if (string == null) return "null";
        if (replacements == null) return string;

        String construct = string;
        for (final @Nullable Object replacement : replacements)
            construct = construct.replaceFirst("\\{}", sanitize(replacement));

        return construct;
    }

    public static @NotNull String sanitize(final @Nullable Object object) {
        if (object == null) return "null";

        return Matcher.quoteReplacement(String.format("%s", object.toString().trim()));
    }

}
