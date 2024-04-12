public abstract class Proceso {

/// el algoritmo lo definimos con esta estructura es un esqueleto:
    
    public void ejecutarProceso() {
        paso1();
        paso2();
        paso3();
        paso4();
    }

    /// Pasos que pueden ser redefinidos por las subclases
    
    protected abstract void paso1();
    protected abstract void paso2();
    protected abstract void paso3();
    protected abstract void paso4();
}