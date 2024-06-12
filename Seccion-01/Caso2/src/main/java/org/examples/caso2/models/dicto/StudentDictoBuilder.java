package org.examples.caso2.models.dicto;

import org.examples.caso2.gui.viewers.DictoApplication;

public class StudentDictoBuilder implements DictoBuilder {
    private DictoApplication result;

    @Override
    public void init() {
        result = new DictoApplication();
    }

    @Override
    public void buildLetters() {
    }

    @Override
    public void buildCategories() {
        result.addCategories();
    }

    @Override
    public void buildAdding() {
    }

    public DictoApplication getResult() {
        return result;
    }
}
