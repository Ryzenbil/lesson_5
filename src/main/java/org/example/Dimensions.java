package org.example;

public class Dimensions {
    private final int width;
    private final int height;
    private final int length;
    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public int CalVolume( int width, int height, int length ) {
        int volume = width * height * length;
        return volume;
    }
    public String toString(){
        return "Width: " + width + ", Height: " + height + ", Length: " + length + "\n";


    }
}
