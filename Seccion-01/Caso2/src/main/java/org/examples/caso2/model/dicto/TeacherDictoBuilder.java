package org.examples.caso2.model.dicto;

import org.examples.caso2.gui.viewers.DictoApplication;

public class TeacherDictoBuilder implements DictoBuilder {
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
        result.manageCategories();
    }

    @Override
    public void buildAdding() {

    }

    @Override
    public DictoApplication getResult() {
        return result;
    }
}
