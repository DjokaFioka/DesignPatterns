package org.example.behavioral.command.guru;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (getEditor().textField.getSelectedText().isEmpty())
            return false;

        backup();
        String source = getEditor().textField.getText();
        getEditor().clipboard = getEditor().textField.getSelectedText();
        getEditor().textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, getEditor().textField.getSelectionStart());
        String end = source.substring(getEditor().textField.getSelectionEnd());
        return start + end;
    }
}