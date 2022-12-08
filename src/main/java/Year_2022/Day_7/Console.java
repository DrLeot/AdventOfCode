package Year_2022.Day_7;

import java.util.ArrayList;

public class Console {

    private final Node root;
    private Node current;

    private int size;

    private Node closest;
    private int alpha;

    public Console(){
        root = new Node("/", null);
        current = root;
    }

    public Node getRoot(){
        return this.root;
    }

    public void execute(String command){
        String[] commands = command.split(" ");
        if (commands[0].equals("$")){
            commands[0] = commands[1];
            if (commands.length > 2){
                commands[1] = commands[2];
            }
        }

        if (commands[0].equals("ls")){
            return;
        }

        if (commands[0].equals("cd")){
            if (commands[1].equals("..")){ // move one up

                if (this.current.getParent() != null){
                    this.current = this.current.getParent();
                }
                return;
            }
            //this.current = root.add(new Node(commands[1], this.current));
            this.current = current.getChildByName(commands[1]);
            return;
        }

        if (commands[0].equals("dir")){
            this.current.add(new Node(commands[1], this.current));
            return;
        }

        // at last: it's a line with files
        this.current.add(new Node(commands[1], Integer.parseInt(commands[0]), this.current));
    }

    public int getClosestTo(){
        alpha = 5174025;
        traverse2(root);
        return this.closest.getSize();
    }

    public int getFoldersSmallerThan(){
        this.size = 0;
        traverse(root);
        return this.size;
    }

    private void traverse2(Node current){
        ArrayList<Node> childDirs = current.getChildDirectories();
        for (Node childDir:childDirs){
            if (childDir.hasDirectories()){
                traverse(childDir);
            }
            System.out.println(childDir);
            // bottom
            if ((5174025 - childDir.getSize()) < alpha){
                alpha = 5174025 - childDir.getSize();
                this.closest = childDir;
            }
        }
    }


    private void traverse(Node current){
        ArrayList<Node> childDirs = current.getChildDirectories();
        for (Node childDir:childDirs){
            if (childDir.hasDirectories()){
                traverse(childDir);
            }
            System.out.println(childDir);
            // bottom
            if (childDir.getSize()<=5174025){
                size += childDir.getSize();
                //System.out.println(childDir);
            }
        }
    }
}
