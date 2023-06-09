// ****************************************************************
//   LinkedStack.java
//
//   A linked implementation of an Object stack class with 
//   operations push, pop, and isEmpty and isFull.
//          
// ****************************************************************

public class LinkedStack <E>
{
    private Node<E> top;       // reference to top of stack         

    // --------------------------------------------------
    // Constructor -- initializes top
    // --------------------------------------------------
    public LinkedStack()
    {
	top = null;
    }


    // --------------------------------------------------
    // Adds new element to top of stack.
    // --------------------------------------------------
    public void push(E val)
    {
	Node<E> newTop = new Node<> (val);
	newTop.setNext(top);
	top = newTop;
    }


    // --------------------------------------------------
    // Removes and returns top element in stack. If the
    // stack is empty returns null. 
    // --------------------------------------------------
    public E pop()
    {
	E item = null;
	if (!isEmpty())
	    {
		item = top.getElement();
		top = top.getNext();
	    }
	return item;
    }


    // --------------------------------------------------
    // Returns true if stack is empty, false otherwise.
    // --------------------------------------------------
    public boolean isEmpty()
    {
	return top == null;
    }


    // --------------------------------------------------
    // Returns true if stack is full, false otherwise.
    //---------------------------------------------------
    public boolean isFull()
    {
	return false;   //a linked stack is never full
    }
}



