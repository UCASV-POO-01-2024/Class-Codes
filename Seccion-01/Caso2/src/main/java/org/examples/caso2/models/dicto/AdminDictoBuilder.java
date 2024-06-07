package org.examples.caso2.models.dicto;

import org.examples.caso2.gui.viewers.DictoApplication;

public class AdminDictoBuilder implements DictoBuilder {
    private DictoApplication result;

    @Override
    public void init() {
        result = new DictoApplication();
    }

    @Override
    public void buildLetters() {
        result.addLetters();
    }

    @Override
    public void buildCategories() {
        result.addCategories();
    }

    @Override
    public void buildAdding() {
        result.addAdding();
    }

    public DictoApplication getResult() {
        return result;
    }
}
