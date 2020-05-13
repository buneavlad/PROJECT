package org.fasttrackit.features.admin;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.pages.admin.LoginPage;
import org.fasttrackit.steps.admin.AddPostSteps;
import org.fasttrackit.steps.admin.DashboardSteps;
import org.fasttrackit.steps.admin.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

import java.util.Random;

public class PostTest extends BaseTest {

    @Steps
    private LoginSteps login;

    @Steps
    private AddPostSteps add;

    @Steps
    private DashboardSteps dash;

    @Test
    public void addNewPost(){
        String title= RandomStringUtils.randomAlphabetic(4);
        String text =RandomStringUtils.randomAlphabetic(10);
        login.LoginInAdmin("admin","parola11");
        dash.hoveroverPostsPage();
        add.addPost(title,text);
        add.getMessage("Post published. View post");

    }

    @Test
    public void RemovePost(){
        String title= RandomStringUtils.randomAlphabetic(4);
        String text =RandomStringUtils.randomAlphabetic(10);
        login.LoginInAdmin("admin","parola11");
        dash.hoveroverPostsPage();
        add.addPost(title,text);
        add.removePost();
        add.getRemovePost("1 post moved to the Trash. Undo");

    }
}
