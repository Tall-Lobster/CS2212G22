package events;


/**
 * @author kkontog, ktsiouni, mgrigori 
 *
 */
public class EventIDMaker {

	private static long eventUIDs = 0L;
	
	/**
	 * 
	 * @return the next number of type {@link long}in the series of UID for the AbstractEvent derived classes
	 */
	protected static long getNewEventID() {
		return eventUIDs++;
	}
	
}
