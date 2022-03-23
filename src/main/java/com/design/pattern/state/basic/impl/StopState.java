package com.design.pattern.state.basic.impl;

import com.design.pattern.state.basic.Context;
import com.design.pattern.state.basic.State;

/**
 * @author jiangbaojun
 * @version v1.0
 * @workid 1861
 * @date 2022/3/23 16:02
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
