package org.op65n.mozaik.api.scheduler;

@FunctionalInterface
public interface Task<R> {

    R exec() throws Exception;

}
