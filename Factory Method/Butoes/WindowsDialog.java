public class WindowsDialog extends Dialog{

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
    
}
