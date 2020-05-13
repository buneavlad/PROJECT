package org.fasttrackit.features.admin;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.BlogSteps;
import org.fasttrackit.steps.admin.CommentsSteps;
import org.fasttrackit.steps.admin.DashboardSteps;
import org.fasttrackit.steps.admin.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CommentsTest extends BaseTest {
    @Steps
    private BlogSteps blogSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CommentsSteps comments;

    @Steps
    private DashboardSteps dash;

    @Test
    public void approveAComment() {
        String name = RandomStringUtils.randomAlphabetic(6);
        String comment = RandomStringUtils.randomAlphabetic(15);
        blogSteps.postComment(comment, name, "vladovidiubunea@gmail.com");
        loginSteps.LoginInAdmin("admin", "parola11");
        dash.clickCommentsPage();
        comments.approveComments();
        comments.getApprovedComment(comment);
    }

    @Test
    public void addCommentToTrash(){
        String name = RandomStringUtils.randomAlphabetic(6);
        String comment = RandomStringUtils.randomAlphabetic(15);
        blogSteps.postComment(comment, name, "vladovidiubunea@gmail.com");
        loginSteps.LoginInAdmin("admin", "parola11");
        dash.clickCommentsPage();
        comments.addToTrash();
        comments.getTrashMessage("Comment by" +" " +name+" "+ "moved to the trash. Undo");
    }
}
