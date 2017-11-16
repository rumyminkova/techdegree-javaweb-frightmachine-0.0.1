package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;

/**
 * Created by Rumy on 11/16/2017.
 */
public class CameraAdapter implements Accessory {
    private Camera camera;
    private int numberOfPhotos;

    public CameraAdapter(Camera camera,int numberOfPhotos) {
        this.camera = camera;
        setNumberOfPhotos(numberOfPhotos);
    }

    public int getNumberOfPhotos() {
        return numberOfPhotos;
    }

    public void setNumberOfPhotos(int numberOfPhotos) {
        this.numberOfPhotos = numberOfPhotos;
    }

    @Override
    public void activate() {
        camera.snapPhotos(getNumberOfPhotos());
    }
}
