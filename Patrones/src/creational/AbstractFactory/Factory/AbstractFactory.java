package creational.AbstractFactory.Factory;

public interface AbstractFactory<T> {
    T create (String type);
}
