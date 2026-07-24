package _04_classObject.app;


public class Controller {
    Service service = new Service();

    void create() {
        service.create();
    }

    void update() {
        service.update();
    }

    void delete() {
        service.delete();
    }
}
