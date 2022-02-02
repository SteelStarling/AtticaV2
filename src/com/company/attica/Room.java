package com.company.attica;

public class Room extends Base {
    private int northExit = 0;
    private int eastExit = 0;
    private int southExit = 0;
    private int westExit = 0;

    public Room(String name, String description, int nExit, int eExit, int sExit, int wExit) {
        super(name, description);
        this.northExit = nExit;
        this.eastExit = eExit;
        this.southExit = sExit;
        this.westExit = wExit;
    }

}
