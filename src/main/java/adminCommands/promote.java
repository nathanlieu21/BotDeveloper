package adminCommands;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;

public class promote extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String code="";

        String []message = event.getMessage().getContentRaw().split("\\s+");

        if( message[0].equalsIgnoreCase("$promote") && (message.length>1 && message.length==3))
        {

            if(message[2].equalsIgnoreCase("Moderator"))
            {
                code="666025205658812506";
            }
            else if(message[2].equalsIgnoreCase("Admin"))
            {
                code="666025252270112802";

            }
            else if(message[2].equalsIgnoreCase("Owner"))
            {
                code="643880410031325194";

            }
            else if(message[2].equalsIgnoreCase("Member"))
            {
                code="665946728393998338";
            }
                try {
                    Member self = event.getGuild().getSelfMember();
                    Member member = event.getMessage().getMentionedMembers().get(0);
                    Role role = event.getGuild().getRoleById(code);
                    event.getChannel().sendMessage(self.getUser().getName() + " Promoted for:" + message[1]).queue();
                    event.getGuild().addRoleToMember(member, role).complete();
                    //event.getGuild().modifyMemberRoles(member,role).complete();
                }
                catch (Exception e)
                {
                    event.getChannel().sendMessage("You can't promote someone with a higher rank").queue();
                }

        }

    }


}
