package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.admin.DashboardPage;
import org.fasttrackit.pages.admin.OrdersPage;
import org.junit.Assert;

public class OrdersSteps {

    private OrdersPage orders;
    private DashboardPage dash;

    @Step
    public void searchOrder(String search){
        dash.clickOrders();
        orders.typeIntoSearchField(search);
        orders.clickSearchOrders();

    }

    @Step
    public void getOrder(String expected){
        String order=orders.getNumberOfOrder();
        Assert.assertEquals(expected,order);
    }


}
