package org.sabourin.formatif_tests;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest {

    ServiceImplementation service = new ServiceImplementation();
    /* -------------- ÉCRIRE VOS TESTS ICI -------------*/

    @Test
    public void exemple(){
        assertTrue(true);
    }

    @Test
    public void AjouterEvaluationOk() throws EvaluationException {
        List<Evaluation> evaluationList = new ArrayList<>();
        Evaluation evaluation = new Evaluation("Ghiles",70,80);

         service.ajouterEvaluation(evaluation);


        Assert.assertEquals(1,evaluationList.size());


    }

    @Test(expected = EvaluationException.class)
    public void MemeNomKO() throws EvaluationException

    {
        List<Evaluation> evaluationList = new ArrayList<>();
        Evaluation evaluation = new Evaluation("Ghiles",70,80);
        Evaluation evaluation2 = new Evaluation("Ghiles",80,90);
        service.ajouterEvaluation(evaluation);
       service.ajouterEvaluation(evaluation2);


        Assert.fail("Exception mauvaise évaluation lancé");
    }


    @Test(expected = EvaluationException.class)
    public void NoteTropBasseKO() throws EvaluationException

    {
        List<Evaluation> evaluationList = new ArrayList<>();
        Evaluation evaluation = new Evaluation("Ghiles",70,0);



        Assert.fail("Exception mauvaise évaluation lancé");
    }
    @Test(expected = EvaluationException.class)
    public void NoteTropHausseKO() throws EvaluationException

    {
        List<Evaluation> evaluationList = new ArrayList<>();
        Evaluation evaluation = new Evaluation("Ghiles",70,260);
        evaluationList.add(evaluation);


        Assert.fail("Exception mauvaise évaluation lancé");
    }





}