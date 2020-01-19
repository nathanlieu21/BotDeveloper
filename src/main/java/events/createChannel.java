package events;

import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.internal.handle.ChannelCreateHandler;

import java.nio.channels.Channel;

public class createChannel extends ListenerAdapter {
public void onGuildMessageReceived(GuildMessageReceivedEvent event)
{
    String [] message= event.getMessage().getContentRaw().split(" ");
    if(message[0].equalsIgnoreCase("$createChannel") && message.length ==2) {

       //TextChannel target=  event.getMessage().getMentionedChannels().get(0);
       event.getGuild().createTextChannel(message[1]).complete();
        //event.getGuild().getTextChannelById(target.getId()).delete().reason(null).queue();
    }
}

}
