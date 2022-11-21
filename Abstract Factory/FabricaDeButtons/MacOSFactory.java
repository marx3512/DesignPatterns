public class MacOSFactory implements IGUIFactory{

    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
    
}
