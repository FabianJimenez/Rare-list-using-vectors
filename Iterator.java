
public class Iterator <T> implements IIterator <T> {
    
    private T[] lista;
    private int[] rindex;
    protected int actual;

    public Iterator (Lista <T> lista) {
        
        this.lista = lista.getLista();
        this.rindex = lista.getRindex();
        this.actual = 1;
    }

    public boolean hasNext() {
        
        if(rindex[actual] == -1) {
            return false;
        }
            
        return true;
    }

    public T next() {
        int siguiente;
        
        if(hasNext()) {
            
            siguiente = rindex[actual];
            actual = siguiente;
            return lista[siguiente];
        }
        
        return null;
    }

    public T current() {
        return lista[actual];
    }

    public void reset() {
        actual = 0;
    }

    public int getCurrent() {
        return actual;
    }
}