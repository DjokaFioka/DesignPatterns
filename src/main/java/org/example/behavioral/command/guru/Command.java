package org.example.behavioral.command.guru;

public abstract class Command {
    private final Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public Editor getEditor() {
        return editor;
    }

    public abstract boolean execute();
}
