package com.cgvsu.transformer;

public interface IModelModifier {
    public void deletePolygon(int modelId, int polygonId);
    public void restorePolygon(int modelId, int polygonId);
}
