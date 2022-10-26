public class ArquivoPDF extends ArquivoPadrao{

    @Override
    void lerArquivo() {
        System.out.println("Lendo arquivo em .pdf");
    }

    @Override
    void converterArquivo() {
        System.out.println("Convertendo arquivo de um .pdf para ");
    }
    
}
