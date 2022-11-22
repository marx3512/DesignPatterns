public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure("html");
        runBusinessLogic();
    }

    static void configure(String os){
        if(os == "html"){
            dialog = new HtmlDialog();
        } else {
            dialog = new WindowsDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
