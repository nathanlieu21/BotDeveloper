package Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class mentionMembers extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        /*
        String message[] = event.getMessage().getContentRaw().split("");
        String [] input = new String [message.length-2];

        if(message[0].equalsIgnoreCase("$mention") & message.length>2) {
            Member member = event.getGuild().getMemberById(message[1].replace("<$", "").replace(">", ""));

            for (int i = 2; i < message.length; i++)
            {
                input[i-2]=message[i];
            }

            event.getChannel().sendMessage(member + Arrays.toString(input)).queue();
        }
        else if(!message[1].equals(event.getMessage().getMentionedMembers().get(0)))
        {
            event.getChannel().sendMessage("You must enter correct player name reference $list");
        }

        //event.getChannel().sendMessage().queueAfter(10,TimeUnit.SECONDS);
    }*/
    }
}
