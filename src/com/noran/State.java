package com.noran;

import java.util.ArrayList;
import java.util.List;

public class State {

    private List<Transition> transitions;
    private boolean isFinal;
    private boolean isError;
    private String condition;


    public State() {
        this(false,false);
    }
    public State(String condition, boolean isFinal, boolean error){
        this.isFinal = isFinal;
        this.condition = condition;
        isError = error;
    }

    public State(boolean isFinal,boolean error) {
        isError = error;
        this.isFinal = isFinal;
        this.transitions = new ArrayList<>();
    }

    public boolean isError(){
        return this.isError;
    }
    public boolean isFinal() {
        return this.isFinal;
    }

    public String getCondition() {
        return condition;
    }

    public State transit(CharSequence c) {
        return transitions
                .stream()
                .filter(t -> t.isPossible(c))
                .map(Transition::state)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Input not accepted: " + c));
    }


    public State with(Transition tr) {
        this.transitions.add(tr);
        return this;
    }
}
