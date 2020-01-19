package adminCommands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class banCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {

        String message [] = event.getMessage().getContentRaw().split("\\s+");
        if(message[0].equalsIgnoreCase("$ban") && (message.length>1 &&message.length==3))
        {
            Member member = event.getMessage().getMentionedMembers().get(0);
            event.getChannel().sendMessage(message[1] + "was banned").queue();
            event.getGuild().ban(member, Integer.parseInt(message[3])).complete();
        }
    }
}
