package org.example.behavioral.command.guru;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (getEditor().clipboard == null
                || getEditor().clipboard.isEmpty())
            return false;

        backup();
        getEditor().textField.insert(getEditor().clipboard, getEditor().textField.getCaretPosition());
        return true;
    }
}
