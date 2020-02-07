//Jose Hurtarte
//Julio Herrera
public interface iStack<E> {

   /**
    * 
    * @param item que se ingresara en la ultima posicion del stack
    */
	public void push(E item);
	// pre: 
	// post: item is added to stack
	// will be popped next if no intervening push
	/**
	 * 
	 * @return ultimo dato del Stack
	 */
	public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
	
	/**
	 * 
	 * @return ultimo dato del stack
	 */
	public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
	
	
	/**
	 * 
	 * @return true si el stack esta vacio y false si tiene contenido
	 */
	public boolean empty();
   // post: returns true if and only if the stack is empty
	
	
	
   /**
    * 
    * @return tamanio de la coleccion
    */
	public int size();
   // post: returns the number of elements in the stack
	
}
