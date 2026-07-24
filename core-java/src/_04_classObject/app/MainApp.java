package _04_classObject.app;

public class MainApp {
    public static void main(String[] args) {
        //call controller class methods
        Controller controller = new Controller();
        controller.create();
        controller.delete();
        controller.update();
    }
}
