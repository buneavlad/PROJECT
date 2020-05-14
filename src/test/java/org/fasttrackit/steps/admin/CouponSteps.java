package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.admin.CouponPage;
import org.fasttrackit.pages.admin.DashboardPage;
import org.junit.Assert;

public class CouponSteps {
    private DashboardPage dash;
    private CouponPage coupon;

    @Step
    public void addCoupon(String title, String amount){
        dash.clickCoupon();
        coupon.clickAddCouponButton();
        coupon.setTitle(title);
        coupon.setCouponAmount(amount);
        coupon.clickPublishButton();

    }

    @Step
    public void couponMessage(String expected){
        String message=coupon.getCouponMessage();
        Assert.assertEquals(expected,message);
    }
}
