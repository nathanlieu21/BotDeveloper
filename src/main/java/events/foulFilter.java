package events;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;



public class foulFilter extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String [] BannedWords = {"Fuck","Bitch","Cunt","Ass","Damn","Shit"};
        String [] message = event.getMessage().getContentRaw().split(" ");
        for(int i=0; i<message.length;i++) {
            for(int l=0; l<BannedWords.length; l++) {
                if(message[i].equalsIgnoreCase(BannedWords[l]))
                {
                    event.getMessage().delete().queue();
                    event.getChannel().sendMessage("No cussing allowed on this server" + event.getAuthor().getName()).queue();
                }

            }
        }
    }
}
