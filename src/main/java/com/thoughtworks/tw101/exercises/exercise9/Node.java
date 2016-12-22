package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Node {
    private String name;
    private Node left;
    private Node right;
    private List<String> list = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {

        //comes before
        if (nameOfNewNode.compareTo(name)<0) {
            if(left == null)
            {
                left = new Node(nameOfNewNode);
            }
            else
            {
                left.add(nameOfNewNode);
            }
        }
        //comes after
        else
        {
            if (right == null)
            {
                right = new Node(nameOfNewNode);
            }
            else
            {
                right.add(nameOfNewNode);
            }

        }


    }
        public List<String> names ()
        {
            if (name != null)
            {
                list.add(name);
            }
            if (left != null)
            {
                list.addAll(left.names());
            }
            if (right != null)
            {
                list.addAll(right.names());
            }
            Collections.sort(list);
            return list;
        }

}
