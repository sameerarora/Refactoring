package com.xebia.xke.nopattern.agile;

/**
 * Created by sameerarora on 6/5/15.
 */
public class AgileTask {

    private static final String TO_DO = "TODO";

    private static final String IN_PROGRESS = "IN_PROGRESS";

    private static final String IN_TEST = "IN_TEST";

    private static final String DONE = "DONE";

    private String state;

    public AgileTask() {
        this.state = TO_DO;
    }

    public void assigned() {
        if (state.equals(TO_DO) || state.equals(IN_PROGRESS)) {
            this.state = IN_PROGRESS;
            System.out.println("Task moved to "+IN_PROGRESS);
        }
        System.out.println("Task cannot be moved to "+IN_PROGRESS+" from "+state);
    }

    public void moveToTest(){
        if(state.equals(IN_PROGRESS)){
            state=IN_TEST;
            System.out.println("Task moved to "+IN_TEST);
        }
        System.out.println("Task cannot be moved to "+IN_PROGRESS+" from "+state);
    }

    public void reOpen(){
        if(state.equals(DONE)){
            state=TO_DO;
            System.out.println("Task has been reopened");
        }
        System.out.println("Task is still open");
    }

    public void done(){
        if(state.equals(IN_PROGRESS)){
            state=DONE;
            System.out.println("Task has been reopened");
        }
        System.out.println("Task is still open");
    }

}