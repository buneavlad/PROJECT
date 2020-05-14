package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.admin.CommentsPage;
import org.fasttrackit.pages.admin.DashboardPage;

public class DashboardSteps {
    private DashboardPage dash;



    @Step
    public void clickFrontHomePage(){dash.clickfrontHomePage(); }

    @Step
    public void clickCommentsPage(){dash.clickCommentsPage();}

    @Step
    public void hoveroverPostsPage(){dash.hoveroverPosts();}

    @Step
    public void hoveroverWooCommmerce(){dash.hoveroverWooCommerce();}




}
