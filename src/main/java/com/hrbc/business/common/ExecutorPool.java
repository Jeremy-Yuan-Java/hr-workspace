package com.hrbc.business.common;


import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author huangyongchao
 */
public class ExecutorPool {
    private static ThreadPoolExecutor executor;

    private static ScheduledExecutorService timeExecutor = Executors.newScheduledThreadPool(10);

    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("hrbc-business-%d").build();

    static {
        executor = new ThreadPoolExecutor(70, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(), namedThreadFactory);

    }

    public static ThreadPoolExecutor getExecutor() {
        return executor;
    }

    public static ScheduledExecutorService getTimeExecutor() {
        return timeExecutor;
    }
}
