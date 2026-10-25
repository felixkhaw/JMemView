package core;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class ThreadMonitor {

    private final ThreadMXBean threads;

    public ThreadMonitor() {
        threads = ManagementFactory.getThreadMXBean();
    }

    public int getThreadCount() {
        return threads.getThreadCount();
    }
}
