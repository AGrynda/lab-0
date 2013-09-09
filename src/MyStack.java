/**
 * Created with IntelliJ IDEA.
 * User: Andrii
 * Date: 09.09.13
 * Time: 22:18
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyStack {
    private int Size;
    private List<Integer> elements;

    public MyStack()
    {
        this.Size = 5;
        this.elements = new ArrayList<Integer>();
    }

    public void push(int el)
    {
        if(elements.size() + 1 > Size)
        {
             pop();
        }
        this.elements.add(el);
    }

    public  void  pop()
    {
        System.out.println("Poped:");
        System.out.println(elements.get(elements.size()-1));
        elements.remove(elements.size()-1);
    }

    public void printStack()
    {
        System.out.println("Stack:");
        for (Integer i:this.elements)
        {
            System.out.println(Integer.toString(i));
        }
    }
}

