package com.github.bohnman.squiggly.web.servlet.support;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;

/**
 * Provides a thread-local for holding a servlet request.
 */
@ThreadSafe
public class SquigglyRequestHolder {
    private static final ThreadLocal<HttpServletRequest> HOLDER = new ThreadLocal<>();

    @Nullable
    public static HttpServletRequest getRequest() {
        return HOLDER.get();
    }

    public static void setRequest(HttpServletRequest request) {
        HOLDER.set(request);
    }

    public static void removeRequest() {
        HOLDER.remove();
    }
}