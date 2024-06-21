package org.examples.caso2.model.dicto;

import org.examples.caso2.gui.viewers.DictoApplication;

public class StudentDictoBuilder implements DictoBuilder {
    private DictoApplication result;

    @Override
    public void init() {
        result = new DictoApplication();
    }

    @Override
    public void buildLetters() {
        result.manageLetters();
    }

    @Override
    public void buildCategories() {

    }

    @Override
    public void buildAdding() {

    }

    @Override
    public DictoApplication getResult() {
        return result;
    }
}
