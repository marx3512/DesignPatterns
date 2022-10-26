public class ArquivoDoc extends ArquivoPadrao{

    @Override
    void lerArquivo() {
        System.out.println("Lendo arquivo em .doc");
    }

    @Override
    void converterArquivo() {
        System.out.println("Convertendo arquivo de um .doc para ");
    }
    
}
