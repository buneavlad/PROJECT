package org.fasttrackit.features.admin;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.admin.CouponSteps;
import org.fasttrackit.steps.admin.DashboardSteps;
import org.fasttrackit.steps.admin.LoginSteps;
import org.fasttrackit.steps.admin.OrdersSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

import java.util.Random;

public class WooCommerceTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private DashboardSteps dash;

    @Steps
    private CouponSteps coupon;

    @Steps
    private OrdersSteps orders;

    @Test
    public void addCoupon(){
        String title = RandomStringUtils.randomAlphabetic(6);
        loginSteps.LoginInAdmin("admin","parola11");
        dash.hoveroverWooCommmerce();
        coupon.addCoupon(title,"10");
        coupon.couponMessage("Coupon updated.");
    }

    @Test
    public void searchForOrder(){
        loginSteps.LoginInAdmin("admin","parola11");
        dash.hoveroverWooCommmerce();
        orders.searchOrder("2978");
        orders.getOrder("#2978 vlad bunea");

    }
}
