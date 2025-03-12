package ro.mpp2024.domeniu;

public interface Identifiable<ID> {
    void setId(ID id);
    ID getId();
}
