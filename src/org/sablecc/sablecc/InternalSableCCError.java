package org.sablecc.sablecc;

/**
 * Some internal error which cannot be blamed on user input.
 * @author anton
 *
 */
public class InternalSableCCError extends RuntimeException
{
	
	public InternalSableCCError()
  {
	  super();
  }

	public InternalSableCCError(String message, Throwable cause)
  {
	  super(message, cause);
  }

	public InternalSableCCError(String message)
  {
	  super(message);
  }

	public InternalSableCCError(Throwable cause)
  {
	  super(cause);
  }

	/**
   * lest Eclipse complain.
   */
  private static final long serialVersionUID = 1L;

}
