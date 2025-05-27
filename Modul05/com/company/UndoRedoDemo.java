package com.company;

public class UndoRedoDemo {
    public static void main(String[] args) {
        UndoRedo<Integer> undoRedo = new UndoRedo<>();
        undoRedo.tambahData(3);
        undoRedo.tambahData(2);
        undoRedo.tambahData(4);
        undoRedo.tambahData(6);
        undoRedo.undo();
        undoRedo.undo();
        undoRedo.redo();
        undoRedo.redo();
        undoRedo.viewListUndo();
        }       
}
