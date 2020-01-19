package events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class EventHelper  extends ListenerAdapter {


    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String messageSent = event.getMessage().getContentRaw(); //returns string version of user message
        if(messageSent.equalsIgnoreCase("Help"))// user enters string
        {
            Member user = event.getMember();// gets user who sent message
            event.getMessage().delete().queue(); //deletes from public
            EmbedBuilder helper = new EmbedBuilder();// default for embed
            helper.setTitle("\uD83C\uDF46" + "Welcome to Discord help");
            helper.setDescription("Listed below our all the commands allowed in this server\n" +
                    "$invite\n" +
                    "$rank\n" +
                    "$music\n" +
                    "$upload files\n" +
                    "$timer message\n" +
                    "help\n");
            helper.addField("Creator","Nathan Lieu The Second Hokage Of The Leaf Village",false);
            helper.setColor(0xC64134);
            user.getUser().openPrivateChannel().complete().sendMessage(helper.build()).queue();




            //event.getChannel().sendMessage("What is your issue").queue(); // gets on same discord channel sends message
        }
    }
}
