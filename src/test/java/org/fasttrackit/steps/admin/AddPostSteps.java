package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.admin.AddNewPostPage;
import org.fasttrackit.pages.admin.AllPostsPage;
import org.fasttrackit.pages.admin.DashboardPage;
import org.junit.Assert;

public class AddPostSteps {

    private AddNewPostPage add;
    private DashboardPage dash;
    private AllPostsPage all;

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
    @Step
    public void removePost(){
        dash.clickAllPosts();
        all.hoveroverPost();
        all.clickTrashButton();

    }

    @Step
    public void getRemovePost(String expected){
        String message = all.getRemoveMessage();
        Assert.assertEquals(expected,message);

    }
}
