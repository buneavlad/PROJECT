package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    private SearchSteps searchSteps;

    @Test
    public void findTheSpecificProduct(){
        searchSteps.searchProduct("t-shirt");
        searchSteps.findProducts("T-Shirt with Logo","T-Shirt","V-Neck T-Shirt");
        searchSteps.checkIfProductIsThere("T-Shirt with Logo");



    }


}
