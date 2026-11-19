package design03.behavior.chain_of_responsibility;

public class CircleHandler extends Handler{

    @Override
    public void handle(RenderRequest request) {
        if (request.shape() instanceof Circle) {
            IO.println("원 render 요청");
            request.shape().draw();
        } else {
            super.handle(request);
        }
    }
}
