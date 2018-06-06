package com.piotrserafin.jokewizardlib;

import com.piotrserafin.jokesmithlib.JokeSmith;

public class JokeWizard {
    public String getJoke() {
        return new JokeSmith().getJoke() + " from JokeWizard";
    }
}
