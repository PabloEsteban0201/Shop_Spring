package com.example1.demo1;

public class Mando {
    private int botones;
    private String color;
    public Mando(int botones, String color){
        this.botones = botones;
        this.color = color;
    }
    public Mando(){
        super();
    }
    /**
     * @return the botones
     */
    public int getBotones() {
        return botones;
    }
    /**
     * @param botones the botones to set
     */
    public void setBotones(int botones) {
        this.botones = botones;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    public String oprimir(){
        return this.color+"-----"+this.botones;
    }
    
}
