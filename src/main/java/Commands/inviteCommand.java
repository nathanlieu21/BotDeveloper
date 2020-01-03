package Commands;

import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.restaction.GuildAction;
import net.dv8tion.jda.internal.handle.ChannelCreateHandler;

import java.nio.channels.Channel;

public class inviteCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String [] message= event.getMessage().getContentRaw().split(" ");
        if(message[0].equalsIgnoreCase("$invite") && message.length ==1)
        {
            event.getMessage().delete().queue();
            Member user = event.getMember();
            TextChannel x = event.getChannel();
            user.getUser().openPrivateChannel().complete().sendMessage("Use this link to invite people" + x.createInvite().setMaxAge(1300).complete().getUrl()).queue();

        }
    }
}
