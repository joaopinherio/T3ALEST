
public class Main {

    public static void main(String[] args) {

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        arvore.adicionarRaiz(5);

        arvore.adicionaEsquerda(arvore.raiz, 3);
        arvore.adicionaDireita(arvore.raiz, 7);

        arvore.adicionaEsquerda(arvore.raiz.esquerdo, 2);
        arvore.adicionaDireita(arvore.raiz.esquerdo, 4);

        arvore.adicionaEsquerda(arvore.raiz.direito, 6);
        arvore.adicionaDireita(arvore.raiz.direito, 8);

        arvore.imprime(arvore.raiz);

        System.out.println("Numero de nodos: " +arvore.contarNodos(arvore.raiz));
        System.out.println("Altura da arvore: " +arvore.altura(arvore.raiz));
        System.out.println("Eh folha: " +arvore.ehFolha(arvore.raiz.direito.direito));
        System.out.println("Numero de folhas: " +arvore.contarFolhas(arvore.raiz));
        System.out.println("Nodo que o numero corresponde: " +arvore.buscar(arvore.raiz, 5));
        System.out.println("nodo correspondente: " +arvore.buscador(arvore.raiz, 2));
    }
}