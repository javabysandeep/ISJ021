package _04_classObject.app;

public class Service {
    Dao dao = new Dao();

    void create() {
        dao.create();
    }

    void update() {
        dao.update();
    }

    void delete() {
        dao.delete();
    }
}
