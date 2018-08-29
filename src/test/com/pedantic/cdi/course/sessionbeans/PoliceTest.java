package com.pedantic.cdi.course.sessionbeans;

import com.pedantic.cdi.course.interfaces.Salute;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class PoliceTest {

    @Inject
    @com.pedantic.cdi.course.annotations.Police
    Salute salute;

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Police.class)
                .addClass(Salute.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void salute() {

        String greeting = salute.salute("boss");
        assertEquals("Expecting greeting to be same", "Yes sir! boss", greeting);
    }
}
