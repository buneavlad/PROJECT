package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.admin.AddNewPostPage;
import org.fasttrackit.pages.admin.DashboardPage;
import org.junit.Assert;

public class AddPostSteps {

    private AddNewPostPage add;
    private DashboardPage dash;

    @Step
    public void addPost(String title, String text){
        dash.hoveroverPosts();
        add.clickAddNew();
        add.setTitle(title);
        add.setContent(text);
        add.clickPublishButton();

    }

    @Step
    public void getMessage(String expected){
        String message=add.getPublishMessage();
        Assert.assertEquals(expected,message);

    }
}
