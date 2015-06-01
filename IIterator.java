public interface IIterator<T> {
    public abstract boolean hasNext();
    public abstract T next ();
    public abstract T current();
}


