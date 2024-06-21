package org.examples.caso2.model.dicto;

public class Director {
    private DictoBuilder builder;

    public Director(DictoBuilder builder) {
        this.builder = builder;
    }

    public void make(String category){
        switch (category){
            case "A":
                builder.buildLetters();
                builder.buildCategories();
                builder.buildAdding();
                break;
            case "T":
                builder.buildCategories();
                break;
            case "S":
                builder.buildLetters();
                break;
        }
    }
}
