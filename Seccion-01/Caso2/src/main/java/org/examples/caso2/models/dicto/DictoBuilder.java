package org.examples.caso2.models.dicto;

import org.examples.caso2.gui.viewers.DictoApplication;

public interface DictoBuilder {
    public void init();
    public void buildLetters();
    public void buildCategories();
    public void buildAdding();
    public DictoApplication getResult();
}
