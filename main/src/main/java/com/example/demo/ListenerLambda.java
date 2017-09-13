package com.example.demo;

/**
 * Created by renyuxiang on 2017/8/28.
 */

public class ListenerLambda extends BaseDemo {
    @Override
    public void test() {
        System.out.println("ListenerLambda Test>");
        Actor actor = new Actor();
        actor.setOnActorActionListener((s)->System.out.println("Action:"+s));
        actor.doAction("Hit");
        System.out.println("End>");
    }

    private class Actor {
        private OnActorActionListener onActorActionListener;

        public void doAction(String name) {
            if (onActorActionListener != null) onActorActionListener.onAction(name);
        }

        public OnActorActionListener getOnActorActionListener() {
            return onActorActionListener;
        }

        public void setOnActorActionListener(OnActorActionListener onActorActionListener) {
            this.onActorActionListener = onActorActionListener;
        }
    }

    private interface OnActorActionListener {
        void onAction(String actionName);
    }
}
