public abstract class Dialog {
    public void renderWindow(){
        IButton button = createButton();
        button.render();
    }

    public abstract IButton createButton();
}
