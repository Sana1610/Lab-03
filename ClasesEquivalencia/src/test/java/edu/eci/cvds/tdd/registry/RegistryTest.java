package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    // TODO Complete with more test cases

    public void validateAliveVoter() {
        Person person = new Person();
        person.setAlive(true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    public void validateUnderageVoter() {
        Person person = new Person();
        person.setAge(17);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    public void validateInvalidAgeNegativeVoter() {
        Person person = new Person();
        person.setAge(-15);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    public void validateInvalidAgeOlderVoter() {
        Person person = new Person();
        person.setAge(20);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    public void validateValidAgeVoter() {
        Person person = new Person();
        person.setAge(20);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    public void validateValidIdVoter() {
        Person person = new Person();
        person.setId(1072775952);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    public void validateInvalidIdVoter() {
        Person person = new Person();
        person.setId(-1072775952);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_ID, result);
    }

    public void validateInvalidIdTwoVoter() {
        Person person = new Person();
        person.setId(25);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_ID, result);
    }

    
}