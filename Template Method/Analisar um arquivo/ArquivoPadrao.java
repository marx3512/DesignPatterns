public abstract class ArquivoPadrao {
    final void convertendoArquivo(){
        pegarArquivo();
        lerArquivo();
        converterArquivo();
        mostrarArquivo();
    }

    abstract void lerArquivo();

    abstract void converterArquivo();

    public void pegarArquivo(){
        System.out.println("Pegando o arquivo");
    }

    public void mostrarArquivo(){
        System.out.println("Mostrando arquivo");
    }
}