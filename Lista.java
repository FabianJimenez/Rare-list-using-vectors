
public class Lista<T> implements ILista<T> {
    private T[] lista;
    private int primero;
    private int ultimo;
    private int[] index;
    private int[] rindex;
    
    public Lista() {
        
        lista = (T[]) new Object[8];
        index = new int[8];
        rindex = new int[8];
        primero = 1;
        ultimo = 1;
    }
    
    public int[] getRindex() {
        
        return rindex;
    }
    
    public T[] getLista() {
        
        return lista;
    }
    
    public boolean add(T obj) {
        
        int z;
        
        if(ultimo == 1) {
            index[1] = -1;
            rindex[1] = -1;
            ultimo += 2;
            lista[1] = obj;
        }
        else
        {
            z = ultimo - 2;
        
            if(ultimo > 7)
            {
                if(ultimo % 2 == 1)
                    ultimo = 0;
                else
                    return false;
            }
            
            lista[ultimo] = obj;
            index[ultimo] = z;
            rindex[z] = ultimo;
            rindex[ultimo] = -1;
            ultimo += 2;
        }
        
        return true;
    }
    
    public T front() {
        return lista[primero];
    }
    
    public T back() {
        return lista[ultimo];
    }
}
