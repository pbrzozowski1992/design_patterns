package pl.sdaacademy.iterator;

public interface Iterator<T extends BaseModel> {
    boolean hasNext();
    T next();
}
