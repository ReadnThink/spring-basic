package hello.core.order;

public interface OrderService {
    //주문을 하는 기능
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
