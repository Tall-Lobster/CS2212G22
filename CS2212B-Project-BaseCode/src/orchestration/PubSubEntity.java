package orchestration;

import publishers.AbstractPublisher;
import subscribers.AbstractSubscriber;
@SuppressWarnings("all")
abstract public class PubSubEntity {

	private AbstractPublisher publisherRole = null;
	private AbstractSubscriber subscriberRole = null; 
	
}
