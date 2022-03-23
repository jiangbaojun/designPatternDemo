package com.design.pattern.iterator;

class NameIterator implements Iterator {

    private final NameContainer nameContainer;
    int index;

    public NameIterator(NameContainer nameContainer) {
        this.nameContainer = nameContainer;
    }

    @Override
    public boolean hasNext() {
        if (index < nameContainer.names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return nameContainer.names[index++];
        }
        return null;
    }
}
