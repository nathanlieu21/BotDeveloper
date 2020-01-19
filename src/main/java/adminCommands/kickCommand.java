package adminCommands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class kickCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {

        String message [] = event.getMessage().getContentRaw().split("\\s+");
        if(message[0].equalsIgnoreCase("$kick") && (message.length>1 &&message.length==2))
        {
            Member member = event.getMessage().getMentionedMembers().get(0);
            event.getChannel().sendMessage(message[1] + "was kicked").queue();
            event.getGuild().kick(member).complete();
        }
    }

}
