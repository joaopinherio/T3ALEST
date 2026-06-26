
public class Main {

    public static void main(String[] args) {

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        arvore.adicionarRaiz(5);

        arvore.adcionaNo(arvore.raiz, 9);
        arvore.adcionaNo(arvore.raiz, 3);

        arvore.imprime(arvore.raiz);

        System.out.println("esquerdo raiz: " + arvore.raiz.esquerdo.valor);
        System.out.println("direito raiz: " + arvore.raiz.direito.valor);
    }
}