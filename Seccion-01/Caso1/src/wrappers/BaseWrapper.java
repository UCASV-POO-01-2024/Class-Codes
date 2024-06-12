package wrappers;

import wrappers.Component;

public abstract class BaseWrapper implements Component {
    private Component wrappee;

    public BaseWrapper(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }

    public abstract void hacer();
}
