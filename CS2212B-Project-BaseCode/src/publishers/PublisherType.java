package publishers;

/**
 * @author kkontog, ktsiouni, mgrigori
 *  
 */
/**
 * @author kkontog, ktsiouni, mgrigori
 * the enumeration of available options that can be used to create
 * an IPublisher using the {@link PublisherFactory#createPublisher(PublisherType, strategies.publisher.StrategyName)} 
 * method
 * 
 * for every new {@link AbstractPublisher} implementing class created, a new entry should be added here
 * 
 */
public enum PublisherType {
	alphaPub, betaPub, gammaPub, deltaPub
}
