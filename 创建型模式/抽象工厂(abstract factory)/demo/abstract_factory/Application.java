public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(Factory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();    
    }

    public static void main(String[] args) {
        Application macOSApplication = new Application(new MacOSFactory());
        macOSApplication.paint();

        Application windowsApplication = new Application(new WindowsFactory());
        windowsApplication.paint();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}