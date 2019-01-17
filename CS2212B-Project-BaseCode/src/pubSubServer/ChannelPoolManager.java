package pubSubServer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author kkontog, ktsiouni, mgrigori
 *  
 *  implements the Singleton Design Pattern
 *  
 *  holds the collection of AbstractChannel type entities and provides the methods for manipulating thes collections
 */
public class ChannelPoolManager {

	private static ChannelPoolManager instance = null;
	private Map<String, AbstractChannel> channelsMap = new HashMap<String, AbstractChannel>();
	private List<AbstractChannel> channelList = new ArrayList<AbstractChannel>();

	private ChannelPoolManager() {
		try {
		BufferedReader channelListReader = new BufferedReader(new FileReader(new File("Channels.chl")));
		while(channelListReader.ready())
			addChannel(channelListReader.readLine());
		channelListReader.close();
		}catch(IOException ioe) {
			System.out.println("Error with loading from file, creating one no_theme_channel");
			addChannel("no_theme");
		}
	}

	protected static ChannelPoolManager getInstance() {

		if (instance == null)
			instance = new ChannelPoolManager();
		return instance;
	}

	
	/**
	 * creates a new AbstractChannel, adds it to the collections and returns it to the caller
	 * @param channelName the name of the new AbstractChannel
	 * @return the new AbstractChannel
	 */
	protected AbstractChannel addChannel(String channelName) {

		Channel ch = new Channel(channelName);
		channelsMap.put(channelName, ch);
		channelList.add(ch);
		return ch;
	}


	/**
	 * removes an AbstractChannel from the collections of available AbstractChannels
	 * @param channelName the name of the AbstractChannel to be removed
	 */
	protected void deleteChannel(String channelName) {

		channelList.remove(channelsMap.get(channelName));
		channelsMap.remove(channelName);
	}

	
	/**
	 * can be used to list all the Channels available in the PubSubServer
	 * @return a list of type {@link AbstractChannel}
	 */
	protected List<AbstractChannel> listChannels() {
		return channelList;
	}

	
	/**
	 * returns the object of AbstractChannel using a name as lookup information
	 * @param channelName the name of the AbstractChannel to be returned
	 * @return the appropriate instance of an AbstractChannel subclass
	 */
	protected AbstractChannel findChannel(String channelName) {
		return channelsMap.get(channelName);
	}

	
	/**
	 * accessor for the ChannelMap use with great caution
	 * @return a Map from String to {@link AbstractChannel}
	 */
	protected Map<String, AbstractChannel> getChannelsMap() {
		return channelsMap;
	}
	
}
