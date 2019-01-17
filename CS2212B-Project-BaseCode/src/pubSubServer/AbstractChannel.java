package pubSubServer;

import events.AbstractEvent;
import subscribers.AbstractSubscriber;


/**
 * @author kkontog, ktsiouni, mgrigori
 *  the abstract base class for the channel functionality
 *  only implemented this way because channels can potentially have different
 *  properties that may affect how the published events are treated.
 *  one interesting exercise for anyone interested would be the creation of 
 *  two subclasses: one with memory and another without it. Of course that entails
 *  the creation of an appropriate factory to select what's to be created and probably 
 *  an enumeration of all available types of channel that can be created by the implemented 
 *  factory method
 */
// TODO modify comments to hint at creation of ChannelFactory
public abstract class AbstractChannel {

	
	
	/**
	 * @param event the event that's to be published
	 */
	protected void publishEvent(AbstractEvent event) {};
	
	/**
	 * @param subscriber the handle of subscriber that wants to subscribe to the channel
	 */
	protected void subscribe(AbstractSubscriber subscriber) {};
	
	/**
	 * @param subscriber the handle of the subscriber that wants to unsubscribe from the channel
	 */
	protected void unsubscribe(AbstractSubscriber subscriber) {};
	
	/**
	 * @return the topic/name of the concrete implementation of Channel 
	 */
	public String getChannelTopic() {
		return "no topic";
		};
	
}
