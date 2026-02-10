package controle;

import excecoes.RaizQuadradaException;

public class Operacoes {
    public static float calcularRaiz(int n) throws RaizQuadradaException{

        if(n < 0){
            throw new RaizQuadradaException();
        }
        else{
            return (float)Math.sqrt(n);
        }
        
    }
}
