package com.noran;

public class Main {

    public static void main(String[] args) {

        ReverseArray reverseArray = new ReverseArray();


        //Test case
        String input = "0~0~00~~~0~0~0P~0~~~0~00";
        String rightHalf = input.substring(input.indexOf("P")+1, input.toCharArray().length);
        String leftHalf = input.substring(0, input.indexOf("P"));
        String reversedLeftHalf = reverseArray.reverse(leftHalf);


        BuildStateMachine buildStateMachine = new BuildStateMachine();
        FiniteStateMachine stateMachine = buildStateMachine.buildStateMachine();
        InputManager inputManager = new InputManager();
        System.out.println("Right half: ");
        inputManager.execute(rightHalf, stateMachine, buildStateMachine);
        System.out.println("Left half: ");
        inputManager.execute(reversedLeftHalf, stateMachine, buildStateMachine);
        }
}
