public abstract Dialog {
    public void renderWindow() {
        // other code
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }
    public abstract Button createButton();
}

class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
