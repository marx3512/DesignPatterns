public class Client {
    private IButton button;
    private ICheckBox checkBox;

    public Client(IGUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
