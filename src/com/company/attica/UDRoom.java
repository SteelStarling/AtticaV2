package com.company.attica;

public class UDRoom extends Room {
    private int upExit = 0;
    private int downExit = 0;

    public UDRoom(String name, String description, int nExit, int eExit, int sExit, int wExit, int uExit, int dExit) {
        super(name, description, nExit, eExit, sExit, wExit);
        this.upExit = uExit;
        this.downExit = dExit;
    }
}
