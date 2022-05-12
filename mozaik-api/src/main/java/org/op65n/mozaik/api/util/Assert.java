package org.op65n.mozaik.api.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.op65n.mozaik.api.exception.AssertException;
import org.op65n.mozaik.api.exception.PrivateConstructorException;

import java.util.Objects;

/**
 * {@link Assert} is a utility class used to check
 * objects and expressions in runtime
 * <p>
 * If method fails {@link org.op65n.mozaik.api.exception.AssertException} will be thrown
 *
 * @author sebba
 * @since 1.0
 */
@SuppressWarnings("unused")
public final class Assert {

    private Assert() {
        throw new PrivateConstructorException(this.getClass());
    }

    /**
     * Checks if passed object is null, redirects method
     * call to {@link Assert#isNull(Object, String, Object...)}
     */
    @Contract("!null -> fail")
    public static void isNull(final @Nullable Object object) throws AssertException {
        Assert.isNull(object, null);
    }

    /**
     * Checks if passed object is null, if passed message is
     * null default fallback message will be used
     * <p>
     * If passed message is not null it and replacements will be
     * passed to {@link StringUtils#format(String, Object...)} method
     * to replace placeholders in message string
     */
    @Contract("!null, _, _ -> fail")
    public static void isNull(final @Nullable Object object, final @Nullable String message, final @Nullable Object... replacements) throws AssertException {
        if (object == null) return;
        if (message != null) throw new AssertException(message, replacements);
        throw new AssertException("Assert#isNull failed");
    }

    /**
     * Checks if passed object is not null, redirects method
     * call to {@link Assert#isNotNull(Object, String, Object...)}
     */
    public static void isNotNull(final @Nullable Object object) throws AssertException {
        Assert.isNotNull(object, null);
    }

    /**
     * Checks if passed object is not null, if passed message is
     * null default fallback message will be used
     * <p>
     * If passed message is not null it and replacements will be
     * passed to {@link StringUtils#format(String, Object...)} method
     * to replace placeholders in message string
     */
    @Contract("null, _, _ -> fail")
    public static void isNotNull(final @Nullable Object object, final @Nullable String message, final @Nullable Object... replacements) throws AssertException {
        if (object != null) return;
        if (message != null) throw new AssertException(message, replacements);
        throw new AssertException("Assert#isNotNull failed");
    }

    /**
     * Checks if passed expression is true, redirects method
     * call to {@link Assert#isTrue(boolean, String, Object...)}
     */
    @Contract("false -> fail")
    public static void isTrue(final boolean expression) throws AssertException {
        Assert.isTrue(expression, null);
    }

    /**
     * Checks if passed expression is true, if passed message is
     * null default fallback message will be used
     * <p>
     * If passed message is not null it and replacements will be
     * passed to {@link StringUtils#format(String, Object...)} method
     * to replace placeholders in message string
     */
    @Contract("false, _, _ -> fail")
    public static void isTrue(final boolean expression, final @Nullable String message, final @Nullable Object... replacements) throws AssertException {
        if (expression) return;
        if (message != null) throw new AssertException(message, replacements);
        throw new AssertException("Assert#isTrue failed");
    }

    /**
     * Checks if passed expression is false, redirects method
     * call to {@link Assert#isFalse(boolean, String, Object...)}
     */
    @Contract("true -> fail")
    public static void isFalse(final boolean expression) throws AssertException {
        Assert.isFalse(expression, null);
    }

    /**
     * Checks if passed expression is false, if passed message is
     * null default fallback message will be used
     * <p>
     * If passed message is not null it and replacements will be
     * passed to {@link StringUtils#format(String, Object...)} method
     * to replace placeholders in message string
     */
    @Contract("true, _, _ -> fail")
    public static void isFalse(final boolean expression, final @Nullable String message, final @Nullable Object... replacements) throws AssertException {
        if (!expression) return;
        if (message != null) throw new AssertException(message, replacements);
        throw new AssertException("Assert#isFalse failed");
    }

    /**
     * Checks if passed objects are equal, redirects method
     * call to {@link Assert#isEqual(Object, Object, String, Object...)}
     */
    @Contract("null, !null -> fail; !null, null -> fail")
    public static void isEqual(final @Nullable Object object, final @Nullable Object comparator) throws AssertException {
        Assert.isEqual(object, comparator, null);
    }

    /**
     * Checks if passed objects are equal, if passed message is
     * null default fallback message will be used
     * <p>
     * If passed message is not null it and replacements will be
     * passed to {@link StringUtils#format(String, Object...)} method
     * to replace placeholders in message string
     */
    @Contract("null, !null, _, _ -> fail; !null, null, _, _ -> fail")
    public static void isEqual(final @Nullable Object object, final @Nullable Object comparator, final @Nullable String message, final @Nullable Object... replacements) throws AssertException {
        if (Objects.equals(object, comparator)) return;
        if (message != null) throw new AssertException(message, replacements);
        throw new AssertException("Assert#isEqual failed");
    }

    /**
     * Checks if passed objects are not equal, redirects method
     * call to {@link Assert#isNotEqual(Object, Object, String, Object...)}
     */
    @Contract("null, null -> fail; !null, !null -> fail")
    public static void isNotEqual(final @Nullable Object object, final @Nullable Object comparator) throws AssertException {
        Assert.isNotEqual(object, comparator, null);
    }

    /**
     * Checks if passed objects are not equal, if passed message is
     * null default fallback message will be used
     * <p>
     * If passed message is not null it and replacements will be
     * passed to {@link StringUtils#format(String, Object...)} method
     * to replace placeholders in message string
     */
    @Contract("null, null, _, _ -> fail; !null, !null, _, _ -> fail")
    public static void isNotEqual(final @Nullable Object object, final @Nullable Object comparator, final @Nullable String message, final @Nullable Object... replacements) throws AssertException {
        if (!Objects.equals(object, comparator)) return;
        if (message != null) throw new AssertException(message, replacements);
        throw new AssertException("Assert#isNotEqual failed");
    }

}

