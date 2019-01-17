package events;

/**
 * @author kkontog, ktsiouni, mgrigori 
 *
 */
public class EventMessage {
	private String header = null;
	private String body = null;
	
	
	/**
	 * @param header String value containing the header of the Event
	 * @param body String value containing the body of the Event
	 */
	public EventMessage(String header, String body) {
		this.header = header;
		this.body = body;
	}

	/**
	 * @return the String containing the Event.header data
	 */
	protected String getHeader() {
		return header;
	}

	/**
	 * @return the String containing the Event.body data
	 */
	protected String getBody() {
		return body;
	}
	
	
}
