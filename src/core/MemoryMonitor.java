package core;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/***
 * Diese Klasse liest die aktuelle Speicherbelegung aus und stellt die Daten für die Weiterverarbeitung in der View zur Verfügung.
 */
public class MemoryMonitor {

    private final MemoryMXBean memory;

    public MemoryMonitor() {
        memory = ManagementFactory.getMemoryMXBean();
    }
    public long getUsedMemory() {
        return memory.getHeapMemoryUsage().getUsed();
    }

    public void printMemoryInfo() {
        MemoryUsage usage = memory.getHeapMemoryUsage();

        System.out.println("Used: " + usage.getUsed());
        System.out.println("Committed: " + usage.getCommitted());
        System.out.println("Max: " + usage.getMax());
    }

}
