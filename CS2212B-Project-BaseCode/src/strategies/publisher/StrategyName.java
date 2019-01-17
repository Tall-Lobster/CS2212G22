package strategies.publisher;

/**
 * @author kkontog, ktsiouni, mgrigori 
 * 	an enumeration of all the available
 *  IStrategy names that can be created using the
 *  {@link StrategyFactory#createStrategy(StrategyName)} note that normally, for
 *  each new implementation of the {@link IStrategy} interface, a new entry
 *  must be added here
 */
public enum StrategyName {
	AStrategy, BStrategy, Default
}
