package com.noran;

public class BuildStateMachine {

    public FiniteStateMachine buildStateMachine() {

        State firstState = new State();
        State secondState = new State();
        State thirdState = new State();
        State deafState = new State("deaf",true, false);
        State errorState = new State(false, true);
        State healthyState = new State("healthy",true, false);


        firstState.with(new Transition("~", secondState));
        firstState.with(new Transition("0", thirdState));
        secondState.with(new Transition("~", errorState));
        secondState.with(new Transition("0", deafState));
        thirdState.with(new Transition("~", healthyState));
        thirdState.with(new Transition("0", errorState));

        return new FiniteStateMachine(firstState);
    }

}
