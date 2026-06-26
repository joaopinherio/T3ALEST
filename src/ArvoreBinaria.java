import org.w3c.dom.Node;

public class ArvoreBinaria<T> {
    No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adicionarRaiz(T valor) {
        raiz = new No<>(valor);
    }

    public void imprime(No<T> atual) {

        if (atual == null) {
            return;
        }

        imprime(atual.esquerdo);
        System.out.println(atual.valor + " ");
        imprime(atual.direito);
    }

    public void adicionaEsquerda(No<T> pai, T valor) {
        if (pai.esquerdo == null) {
            pai.esquerdo = new No<>(valor);
        }
    }

    public void adicionaDireita(No<T> pai, T valor) {
        if (pai == null) {
            return;
        } else if (pai.direito != null) {
            return;
        } else {
            pai.direito = new No<>(valor);
        }
    }

    public int contarNodos(No<T> atual) {
        if (atual == null) {
            return 0;
        }

        return 1 + contarNodos(atual.direito) + contarNodos(atual.esquerdo);

    }

    public int altura(No<T> atual) {
        if (atual == null) {
            return 0;
        }
        int cont1 = 0;
        int cont2 = 0;

        cont1 = altura(atual.direito);
        cont2 = altura(atual.esquerdo);

        if (cont1 > cont2) {
            return cont1 + 1;
        }
        if (cont2 > cont1) {
            return cont2 + 1;
        }
        return cont1 + 1;

    }

    public boolean ehFolha(No<T> nodo) {
        if (nodo == null) {
            return false;
        }

        boolean v = ehFolha(nodo.direito);
        boolean c = ehFolha(nodo.esquerdo);
        if ((v || c) == false) {
            return true;

        }
        return false;
    }

    public int contarFolhas(No<T> atual) {
        int cont = 1;
        if (atual == null) {
            return 0;
        }
        boolean v = ehFolha(atual.direito);
        boolean c = ehFolha(atual.esquerdo);

        if ((v || c) == false) {
            return cont + 1;
        }
        return cont + 1;
    }

    /*
     * public No<T> buscar(No<T> atual){
     * return localizar(atual, 6);
     * }
     * 
     * public No<T> localizar(No<T> atual, int valor){
     * if(atual == null){
     * return null;
     * }
     * 
     * 
     * No v1= buscar(atual.esquerdo);
     * No v2 = buscar(atual.direito);
     * 
     * if((v1.valor == atual.valor)){
     * // if(v1.valor == localizar(atual, valor))
     * return atual;
     * 
     * }
     * if((v2.valor == atual.valor)){
     * // if(v1.valor == localizar(atual, valor))
     * return atual;
     * 
     * }
     * return null;
     * }
     */

    public No<T> buscar(No atual, int valor) {
        if (atual == null || atual.valor.equals(valor)) {
            return atual;
        }

        No aux = buscar(atual.esquerdo, valor);
        if (aux != null) {
            return aux;
        }
        return buscar(atual.direito, valor);
    }
     public No buscador(No atual, int valorProcurado) {
        if (atual == null || atual.valor.equals(valorProcurado)) {
            return atual;
        }
        if ((Integer)atual.valor > valorProcurado) {
            return buscador(atual.esquerdo, valorProcurado);
        }

        return buscador(atual.direito, valorProcurado);
    }

   /*
   public int nivel(No<T> atual, T valor, int nivelAtual){
        if(atual == null){
            return -1;
        } */ 

        
    }


