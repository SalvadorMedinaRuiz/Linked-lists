// ****************************************************************
//   LinkedStackTest.java
//
//   A simple driver that exercises push, pop, and isEmpty. Thanks
//   to autoboxing, we can push integers onto a stack of Objects
//          
// ****************************************************************


public class LinkedStackTest
{

    // --------------------------------------------------
    //  Pushes even integers on a stack, then pops and
    //  prints them then pushes more and pops and prints.
    // --------------------------------------------------
    public static void main(String[] args)
    {
	LinkedStack<Integer> stack = new LinkedStack<>();

	//push some stuff on the stack
	for (int i=0; i<10; i++)
	    stack.push(i*2);

	//pop and print
	//should print 18 16 14 12 10 8 6 4 2 0
	while (!stack.isEmpty())
	    System.out.print(stack.pop() + " ");
	System.out.println();

	//push a few more things on the stack
	for (int i = 1; i <= 6; i++)
	    stack.push(i);

	//should print 6 5 4 3 2 1
	while (!stack.isEmpty())
	    System.out.print(stack.pop() + " ");
	System.out.println();
    }    
}

