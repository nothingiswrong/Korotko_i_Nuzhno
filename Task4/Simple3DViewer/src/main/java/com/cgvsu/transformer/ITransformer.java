package com.cgvsu.transformer;

public interface ITransformer {
    public void setAngleMetric();
    public void translateModel(int id, float distance);
    public void rotateModel(int id, float angle);
    public void scaleModel(int id, float scaleFactor);
}
