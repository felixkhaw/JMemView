import core.MemoryMonitor;
import core.ProcessScanner;
import javafx.application.Application;
import view.MainWindow;

public class Main {
    static void main(String[] args) {
        // MemoryMonitor monitor = new MemoryMonitor();
        // monitor.printMemoryInfo();
        // ProcessScanner processScanner = new ProcessScanner();
        // processScanner.scan();
        Application.launch(MainWindow.class, args);
    }
}
