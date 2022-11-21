public class Main {
    public static void main(String[] args) {
        NotebookFactory notebookFactory = new NotebookFactory();

        notebookFactory.escolhendoNotebook("Acer");
        System.out.println("--------------------");
        notebookFactory.escolhendoNotebook("Dell");
        System.out.println("--------------------");
        notebookFactory.escolhendoNotebook("Alienware");
        System.out.println("--------------------");
    }
}
