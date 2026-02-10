package excecoes;

public class RaizQuadradaException extends RuntimeException {
    
    public RaizQuadradaException(){
        super("Número negativo não tem raiz quadrada");
    }
    
}
