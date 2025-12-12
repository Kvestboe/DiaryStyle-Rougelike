package model.items;

import model.interfaces.ItemInterface;

public abstract class AbstractItem implements ItemInterface {
    private final String name;
    private final String description;

    public AbstractItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
