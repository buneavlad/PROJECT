package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.BlogPage;
import org.fasttrackit.pages.Homepage;
import org.junit.Assert;

public class BlogSteps {
    private Homepage homepage;
    private BlogPage blogPage;

    @Step
    public void  postComment(String comment, String name,String email){
        homepage.open();
        homepage.clickBlogButton();
        blogPage.setCommentsFieldField(comment);
        blogPage.setNameField(name);
        blogPage.setEmailField(email);
        blogPage.clickPostCommentButton();



    }
    @Step
    public void findThePostedComment(String name){
        Assert.assertTrue(blogPage.getNameOfCommentator(name));
    }

    @Step
    public void errorNameAndEmailField(String expected){
        String name = blogPage.nameAndEmailFieldError();
        Assert.assertEquals(expected,name);

    }
    @Step
    public void errorCommentField(String expected){
        String name = blogPage.commentFieldError();
        Assert.assertEquals(expected,name);
    }


}
