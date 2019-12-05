package be.ucll.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class SelectionView implements Serializable {
    private Order selectedOrder;

    @Inject
    private OrderServiceImpl orderService;


    public Order getSelectedOrder() {
        return selectedOrder;
    }

    public void setSelectedOrder(Order selectedOrder) {
        this.selectedOrder = selectedOrder;
    }

    public OrderServiceImpl getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }
}
