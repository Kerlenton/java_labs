package ru.mirea.lab8;

class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("Visited ElementA");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("Visited ElementB");
    }
}
