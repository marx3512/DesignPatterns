public class WindowsButton implements IButton{

    @Override
    public void render() {
        System.out.println("Show window button");
        onClick();        
    }

    @Override
    public void onClick() {
        System.out.println("Click button");        
    }
    
}
