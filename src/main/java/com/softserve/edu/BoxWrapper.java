package com.softserve.edu;

public class BoxWrapper {
    private Box box;

    public BoxWrapper() {
        box = new Box();
    }
    
    public Integer get() {
        return (int) box.get();
    }

    public void set(Integer data) {
        box.set(data);
    }
}
