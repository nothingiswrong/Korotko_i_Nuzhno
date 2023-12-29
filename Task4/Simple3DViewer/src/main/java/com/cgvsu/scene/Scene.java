package com.cgvsu.scene;

import com.cgvsu.render_engine.Camera;
import com.cgvsu.scene.model.Model;
import com.cgvsu.util.IObservable;
import com.cgvsu.util.IObserver;

import java.util.ArrayList;

public class Scene implements IObservable {
    public ArrayList<Model> models;
    public ArrayList<Camera> cameras;
    public ArrayList<IObserver> observers;

    public void addCamera(Camera camera) {
        cameras.add(camera);
        notifyObservers();
    }

    public void addModel(Model model) {
        models.add(model);
        notifyObservers();
    }
    @Override
    public void addObserver(IObserver observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (var o : observers) {
            o.update();
        }
    }
}
