package ro.mpp2024.domeniu;

public class Entity <T> {
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
