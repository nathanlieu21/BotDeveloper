package adminCommands;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;

import java.util.List;


public class kickCommand extends ListenerAdapter {
    public void execute (GuildMessageReceivedEvent event)
    {

        final TextChannel channel = event.getChannel();
        String [] message= event.getMessage().getContentRaw().split(" ");
        if(message[0].equalsIgnoreCase("$kick") && message.length ==2)
        {

            Message m = event.getMessage();
            Member x = m.getMentionedMembers().get(0);



           event.getGuild().kick(x,null)
                   .reason(null)
                   .queue();

        }

    }

}
