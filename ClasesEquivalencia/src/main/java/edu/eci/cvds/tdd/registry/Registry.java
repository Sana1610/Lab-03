package edu.eci.cvds.tdd.registry;
public class Registry {
    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        if(p.isAlive() == false){
            return RegisterResult.DEAD;
        }

        if(p.getAge() < 18 && p.getAge() >= 0){
            return RegisterResult.UNDERAGE;
        }

        if(p.getAge() < 0 || String.valueOf(p.getAge()).length() > 3 || p.getAge() > 135){
            return RegisterResult.INVALID_AGE;
        }

        if(p.getId() <= 0 || String.valueOf(p.getId()).length() != 10){
            return RegisterResult.INVALID_ID;
        }

        return RegisterResult.VALID;
    }
}