package com.noran;

public class Transition {

    private String rule;
    private State next;

    public State state() {
        return this.next;
    }

    public boolean isPossible(CharSequence c) {
        return this.rule.equalsIgnoreCase(String.valueOf(c));
    }

    public Transition(String rule, State next) {
        this.rule = rule;
        this.next = next;
    }

}
