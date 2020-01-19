package adminCommands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class muteCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String []message = event.getMessage().getContentRaw().split("\\s+");
        if( message[0].equalsIgnoreCase("$mute") && (message.length>1 && message.length==2))
        {
            Member member = event.getMessage().getMentionedMembers().get(0);// gets first mention member
                    //event.getGuild().getMemberById(message[0].replace("<@", "").replace(">",""));
            Role role = event.getGuild().getRoleById("666038665633333280");// get roles by id
            if(!member.getRoles().contains(role))
            {
                event.getChannel().sendMessage("Muted" + message[1]).queue();
                event.getGuild().addRoleToMember(member,role).complete();
            }
            else
            {
                event.getChannel().sendMessage("unMuted" + message[1]).queue();
                event.getGuild().removeRoleFromMember(member,role).complete();
            }
        }


    }
}
