package com.noran;

public class InputManager {

    public void execute(String oneHalf, FiniteStateMachine stateMachine, BuildStateMachine build) {

        for (int i = 0; i < oneHalf.length(); i++) {
            stateMachine = stateMachine.switchState(String.valueOf(oneHalf.charAt(i)));

            if (stateMachine.getCurrent().isFinal()&& stateMachine.getCurrent().getCondition().equalsIgnoreCase("deaf")) {
                System.out.println("Deaf");
                stateMachine = build.buildStateMachine();
            }
            else if (stateMachine.getCurrent().isFinal()&& stateMachine.getCurrent().getCondition().equalsIgnoreCase("healthy")){
                System.out.println("Healthy");
                stateMachine = build.buildStateMachine();
            }
            else if (stateMachine.getCurrent().isError()) {
                i -= 1;
                stateMachine = build.buildStateMachine();
            }

        }
    }
}
