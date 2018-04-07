package com.adumentum.box.es.cucumber.stepdefs;

import com.adumentum.box.es.EsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = EsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
