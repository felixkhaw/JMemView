import core.MemoryMonitor;
import core.ProcessScanner;

public class Main {
    static void main(String[] args) {
        // MemoryMonitor monitor = new MemoryMonitor();
        // monitor.printMemoryInfo();
        ProcessScanner processScanner = new ProcessScanner();
        processScanner.scan();
    }
}
