package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.BlogSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class BlogTest extends BaseTest {
    @Steps
    private BlogSteps blogSteps;

    @Test
    public void addCommentToBlog(){
        String name = RandomStringUtils.randomAlphabetic(5);
        String comment=RandomStringUtils.randomAlphabetic(15);
        blogSteps.postComment(comment,name,"vladovidiubunea@gmail.com");
        blogSteps.findThePostedComment(name);
    }

}
