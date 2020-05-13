package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.BlogPage;
import org.fasttrackit.pages.admin.CommentsPage;
import org.junit.Assert;

public class CommentsSteps {

    private CommentsPage comments;
    private BlogPage blog;

    @Step
    public void approveComments(){
        comments.hoveroverComment();
        comments.clickApproveButton();
        comments.clickViewPage();

    }

    @Step
    public void getApprovedComment(String comment){
        Assert.assertTrue(blog.getComment(comment));
    }

    @Step
    public void addToTrash(){
        comments.hoveroverComment();
        comments.clickTrashButton();
    }

    @Step
    public void getTrashMessage(String expected){
        String message= comments.getTrashMessage();
        Assert.assertEquals(expected,message);
    }
}
