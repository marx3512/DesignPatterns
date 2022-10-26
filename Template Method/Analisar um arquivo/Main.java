public class Main {
    public static void main(String[] args) {
        ArquivoDoc arquivoDoc = new ArquivoDoc();
        ArquivoPDF arquivoPDF = new ArquivoPDF();

        arquivoDoc.convertendoArquivo();

        arquivoPDF.convertendoArquivo();
    }
}
