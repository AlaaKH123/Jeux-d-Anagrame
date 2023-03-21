package jeux;

public interface Word {

    public abstract void init();
    public abstract String mixedWord();
    public abstract String mixedRandomWord();
    public abstract boolean isEquals(String text);

}

