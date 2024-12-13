package ShapPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SquareShap implements shap {
    private double length;
    private Draw2d d2;
    private Draw3d d3;
    @Autowired
    public void setD3(Draw3d d3) {
        this.d3 = d3;
    }
    @Autowired
    public void setD2(Draw2d d2) {
        this.d2 = d2;
    }
    @Override
    public  void draw2dShap (){
        d2.draw2dShap("Square");
    }
    @Override
    public  void draw3dShap (){
        d3.draw3dShap("Square");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

}
