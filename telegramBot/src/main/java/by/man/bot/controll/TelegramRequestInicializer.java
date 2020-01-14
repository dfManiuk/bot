package by.man.bot.controll;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import by.man.bot.main.MessageType;

public class TelegramRequestInicializer {
	
	/**
     * Оригинальный запрос пользователя
     */
    private Update update;
    /**
     * Сообщение пользователя
     */
    private Message message;
    /**
     * Идентификатор беседы
     */
    private long chatId;
    /**
     * Ссылка на сущьность Chat
     */
    private Chat chat;
    /**
     * Ссылка на сущьность User
     */

    private User user;
    /**
     * строка ввода пользователя
     */
    private String text;

    /**
     * Сессия диалога
     */
    private TelegramSession session;
    /**
     * Тип запроса
     */
    private MessageType messageType;


    
    private SendMessage sendMessage;

	private CommandHelper helper = CommandHelper.getInstance();
	
    public TelegramRequestInicializer(Update update) {
        this.update = update;     
        this.message = firstNonNull(update.getMessage(),
                update.getEditedMessage(),
                update.getChannelPost(),
                update.getEditedChannelPost());
        if (message != null) {
            this.user = firstNonNull(message.getFrom(), message.getLeftChatMember(), message.getForwardFrom());
            this.chat = firstNonNull(message.getChat(), message.getForwardFromChat());
            this.text = message.getText();
            this.sendMessage = new SendMessage();
            this.chatId = update.getMessage().getChatId();
            this.sendMessage.setChatId(chatId);
            if (text != null) { 
                         	
                this.sendMessage = helper.getCommand(text).returnMessage(update, this.sendMessage);
                TelegramSession.getAttribute().put(String.valueOf(chatId), update);
             //   sendMessage.setText( helper.getCommand(text).returnRequest(update));  
                
            } else if (update.getMessage().hasLocation() == true) {
            String text =	TelegramSession.getAttribute().get(String.valueOf(chatId)).getMessage().getText();
            	 this.sendMessage = helper.getCommand(text).returnMessage(update, this.sendMessage);
           // 	 this.sendMessage = helper.getCommand("/stopper").returnMessage(update, this.sendMessage);
            }
            }
        if (chat != null) {
            chatId = chat.getId();
        } else if (user != null) {
            chatId = Long.valueOf(user.getId());
        } else {
            chatId = Long.valueOf(update.getUpdateId());
        }
               
     //   session.getAttribute().put(String.valueOf(chatId), this);
    }

	@SuppressWarnings("unchecked")
	private <T> T firstNonNull(T... messages) {
		 for (T message : messages) {
	            if (message != null) {
	                return message;
	            }
	        }
	        return null;
	}

	public void setSession(TelegramSession session) {
		this.session = session;	
	}
	
	public TelegramSession getSession() {
		return session;	
	}

	public Long getChatId() {
		return chatId;
	}

	public void setChatId(Long chatId) {
		this.chatId = chatId;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}


	public Update getUpdate() {
		return update;
	}

	public Message getMessage() {
		return message;
	}
	
	public CommandHelper getHelper() {
		return helper;
	}

	public void setHelper(CommandHelper helper) {
		this.helper = helper;
	}

	public void setUpdate(Update update) {
		this.update = update;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public void setChatId(long chatId) {
		this.chatId = chatId;
	}

	public SendMessage getSendMessage() {
		return sendMessage;
	}

	public void setSendMessage(SendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}

	@Override
	public String toString() {
		return "TelegramRequestInicializer [update=" + update + ", message=" + message + ", chatId=" + chatId
				+ ", chat=" + chat + ", user=" + user + ", text=" + text + ", session=" + session + ", messageType="
				+ messageType + ", sendMessage=" + sendMessage + ", helper=" + helper + "]";
	}


}