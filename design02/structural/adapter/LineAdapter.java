package design02.structural.adapter;

public class LineAdapter implements Shape {
    private Line legacyLine;

    public LineAdapter(Line legacyLine) {
        this.legacyLine = legacyLine;
    }


    @Override
    public void draw() {
        legacyLine.renderLine();
    }
}
