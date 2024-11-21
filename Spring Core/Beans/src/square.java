public class square implements shap {
    private double length;

    @Override
    public double getArea() {
        return length*length;
    }
}