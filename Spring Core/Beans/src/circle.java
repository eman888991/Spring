public class circle implements shap {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
