public class No<T>{
        T valor;
        No <T> direito;
        No <T> esquerdo;
        No <T> pai;

        public No(T valor){
            this.valor = valor;
            this.esquerdo = null;
            this.direito = null;
            this.pai = null;       
        }
    }