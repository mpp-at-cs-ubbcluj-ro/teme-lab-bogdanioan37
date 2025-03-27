package ro.mpp.lab5clasa.laborator5clasa.model;


public interface Identifiable<Tid> {
    Tid getID();
    void setID(Tid id);
}