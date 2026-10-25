package core;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;
import java.util.List;

public class ProcessScanner {

    public void scan() {
        List<VirtualMachineDescriptor> processes = VirtualMachine.list();

        for (VirtualMachineDescriptor process : processes) {
            System.out.println("PID: " + process.id());
            System.out.println("Name: " + process.displayName());
        }
    }
}
