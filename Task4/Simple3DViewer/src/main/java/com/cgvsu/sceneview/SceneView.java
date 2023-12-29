package com.cgvsu.sceneview;

import com.cgvsu.scene.Scene;
import com.cgvsu.util.IObserver;

import java.util.ArrayList;

public class SceneView implements IObserver {
    public Scene scene;
    public ArrayList<ModelView> modelViews = new ArrayList<>();
    public ArrayList<CameraView> cameraViews = new ArrayList<>();
    public SceneView(Scene scene) {
        for (var m : scene.models) {
            modelViews.add(new ModelView(m));
        }
        for (var c : scene.cameras) {
            cameraViews.add(new CameraView(c));
        }
        this.scene = scene;
    }

    @Override
    public void update() {
        if (scene.models.size() != modelViews.size()) {
           modelViews.add(new ModelView(scene.models.get(scene.models.size() - 1)));
        }
        if (scene.cameras.size() != cameraViews.size()) {
            cameraViews.add(new CameraView(scene.cameras.get(scene.models.size() - 1)));
        }
    }
}
