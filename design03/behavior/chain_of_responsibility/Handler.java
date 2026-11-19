package design03.behavior.chain_of_responsibility;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(RenderRequest request) {
        if (request == null) {
            IO.println("요청이 null 입니다.");
            return;
        }

        if (request.shape() == null) {
            IO.println("도형 정보가 null 입니다.");
            return;
        }

        if (next != null) {
            next.handle(request);
        } else {
            IO.println("처리할 수 있는 handler가 없습니다.");
        }
    }
}
