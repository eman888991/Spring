package ShapPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircleShap implements shap{
    private double radius;
    private Draw2d d2;
    private Draw3d d3;
    @Autowired
    CircleShap(Draw2d d2, Draw3d d3) {
        this.d2 = d2;
        this.d3 = d3;
    }
    @Override
    public void draw2dShap (){
        d2.draw2dShap("circle");
    }
    @Override
    public void draw3dShap (){
        d3.draw3dShap("circle");
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
