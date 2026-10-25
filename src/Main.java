import core.MemoryMonitor;
import core.ProcessScanner;
import core.ThreadMonitor;

public class Main {
    static void main(String[] args) {
        // MemoryMonitor monitor = new MemoryMonitor();
        // monitor.printMemoryInfo();
        // ProcessScanner processScanner = new ProcessScanner();
        // processScanner.scan();
        ThreadMonitor threadMonitor = new ThreadMonitor();
        System.out.println("Threads: " + threadMonitor.getThreadCount());
    }
}
