package Year_2022.Day_7;

import java.util.ArrayList;

public class Node {

    private final String name;
    private final int size;
    private final Node parent;
    private ArrayList<Node> nodes = new ArrayList<>();


    public Node(String name, int size, Node parent){
        this.name = name;
        this.size = size;
        this.parent = parent;
    }
    public Node(String name, Node parent){
        this(name, 0, parent);
    }

    public Node add(Node node){
        Node existing = getChildByName(node.getName());
        if (existing == null){ // doesnt exists yet
            nodes.add(node);
            return node;
        }
        return existing;
    }

    public boolean hasDirectories(){
        for (Node node:nodes){
            if (node.size <= 0){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Node> getChildDirectories(){
        ArrayList<Node> dirs = new ArrayList<>();
        for (Node node:nodes){
            if (node.size <= 0){
                dirs.add(node);
            }
        }
        return dirs;
    }

    public ArrayList<Node> getChilds(){
        return this.nodes;
    }

    public Node getChildByName(String search){
        for(Node node:nodes) {
            if (search.equals(node.getName())){
                return node;
            }
        }
        return null;
    }

    public int getSize(){
        int sum = 0;
        if(nodes.size() <= 0){
            return this.size;
        }
        for(Node node:nodes){
            sum += node.getSize();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.getSize();
    }

    public Node getParent() {
        return parent;
    }
}
