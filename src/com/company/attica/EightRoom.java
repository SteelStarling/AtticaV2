package com.company.attica;

public class EightRoom extends Room{
    private int neExit = 0;
    private int seExit = 0;
    private int swExit = 0;
    private int nwExit = 0;

    public EightRoom(String name, String description, int nExit, int neExit, int eExit, int seExit, int sExit, int swExit, int wExit, int nwExit) {
        super(name, description, nExit, eExit, sExit, wExit);
        this.neExit = neExit;
        this.seExit = seExit;
        this.swExit = swExit;
        this.nwExit = nwExit;
    }
}
