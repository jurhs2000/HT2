package prefixCalculator;

import java.util.Vector;

public class Stack<E> implements iStack<E> {
	
	protected Vector<E> data;

	/**
	 * Crea el constructor de la clase de tipo Stack
	 */
	public Stack()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
	}

	/**
	 * Manda el item ingresado al final del stack
	 */
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	/**
	 * devuelve el ultimo dato del stack y lo elimina del stack
	 */
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	/**
	 * deja ver el ultimo dato del stack sin removerlo
	 */
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	/**
	 * devuelve la cantidad de items en el stack
	 */
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	/**
	 * da true si el stack esta vacio
	 */
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}

}
