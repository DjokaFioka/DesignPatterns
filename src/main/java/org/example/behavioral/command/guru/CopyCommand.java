package org.example.behavioral.command.guru;

public class CopyCommand extends Command{

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        getEditor().clipboard = getEditor().textField.getSelectedText();
        return false;
    }
}
