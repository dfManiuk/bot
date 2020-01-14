package by.man.bot.controll;

import java.util.HashMap;
import java.util.Map;

import by.man.bot.requests.IRequest;
import by.man.bot.requests.SpaceRequest;
import by.man.bot.requests.StopperRequest;
import by.man.bot.requests.TalkRequest;
import by.man.bot.requests.WeatherRequest;

public class CommandHelper {

	private static final CommandHelper instance = new CommandHelper();
	
	private Map<CommandName, IRequest> requests = new HashMap<>();
	
	public CommandHelper() {
		requests.put(CommandName.WEATHER, new WeatherRequest());
		requests.put(CommandName.SPACE, new SpaceRequest());
		requests.put(CommandName.STOPPER, new StopperRequest());
		requests.put(CommandName.TALKE, new TalkRequest());
	}
	
	public static CommandHelper getInstance() {
		return instance;
	}
	public IRequest getCommand(String commandName) {
		
		CommandName name = CommandName.valueOf(commandName.toUpperCase().substring(1));
		
		IRequest command;
		if (null !=name) {
			command = requests.get(name);
		} else {
			command = requests.get(CommandName.NO_SUCH_COMMAND);
		}
		return command;
	}
}
