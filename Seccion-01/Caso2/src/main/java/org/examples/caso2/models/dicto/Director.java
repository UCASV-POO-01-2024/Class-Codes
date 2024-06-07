package org.examples.caso2.models.dicto;

public class Director {
    private DictoBuilder builder;

    public Director(DictoBuilder builder) {
        this.builder = builder;
    }

    public void make(String type){
        switch (type){
            case "A":
                builder.buildLetters();
                builder.buildCategories();
                builder.buildAdding();
                break;
            case "T":
                builder.buildLetters();
                break;
            case "S":
                builder.buildCategories();
                break;
        }
    }
}
