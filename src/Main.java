import controller.UserController;
import model.FileOperations;
import model.FileOperationsImpl;
import model.MachineInterface;
import model.MachineInterfaceImpl;
import view.UserInterface;

public class Main {
    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperationsImpl("toys.csv");
        MachineInterfaceImpl machineInterface = new MachineInterfaceImpl(fileOperations);
        UserController userController = new UserController(machineInterface);
        UserInterface ui = new UserInterface(userController);
        ui.run();
    }
}