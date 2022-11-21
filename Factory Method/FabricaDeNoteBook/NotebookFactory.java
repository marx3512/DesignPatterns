public class NotebookFactory {
    public Notebook escolhendoNotebook(String marca){
        if(marca == "Acer"){
            NotebookAcer notebookAcer = new NotebookAcer("Acer", "i7", "MX150");
            notebookAcer.mostrarInformacoes();
            return notebookAcer;
        }
        else if(marca == "Dell"){
            NotebookDell notebookDell = new NotebookDell("Dell", "Ryzen 7", "Radeon 8");
            notebookDell.mostrarInformacoes();
            return notebookDell;
        }
        else{
            System.out.println("Notebook nao encontrado");
            return null;
        }
    }
}
