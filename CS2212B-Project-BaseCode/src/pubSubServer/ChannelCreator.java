package pubSubServer;


/**
 * @author kkontog, ktsiouni, mgrigori
 * MUST IMPLEMENT the Singleton design pattern
 * this class is responsible for creating and deleting channels
 * it's also the only class that can do so
 */
public class ChannelCreator {
	
	private ChannelPoolManager cpm = null;
	
	protected static ChannelCreator getInstance() {
		return instance;
	}

	
	
	/**
	 * creates a new Channel and adds it to the list of Channels so that it can be discovered using the 
	 * {@link ChannelDiscovery} methods
	 * @param channelName name of the Channel to be created
	 * @return the new channel (of any type that extends the {@link AbstractChannel} that has been created
	 */
	protected AbstractChannel addChannel(String channelName) {
		return cpm.addChannel(channelName);
	}

	/**
	 * deletes a channel and removes it from all channels stores so that no one can access it anymore
	 * @param channelName name of the channel to be deleted
	 */
	protected void deleteChannel(String channelName) {
		cpm.deleteChannel(channelName);
	}

}
